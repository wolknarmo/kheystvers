package com.wolknarmo.kheystvers;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

	DrawerLayout drawer;
	FragmentManager fragmentManager;
	ActionBarDrawerToggle drawerToggle;
	NavigationView navigationView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity_layout);
		drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		fragmentManager = getFragmentManager();

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);

		drawerToggle = new ActionBarDrawerToggle(this, drawer, R.string.open_drawer, R.string.close_drawer) {
			@Override
			public void onDrawerClosed(View view) {
				super.onDrawerClosed(view);
			}

			@Override
			public void onDrawerOpened(View drawerView) {
				super.onDrawerOpened(drawerView);
			}
		};

		getSupportActionBar().setCustomView(R.layout.image);

		drawer.addDrawerListener(drawerToggle);

		navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(this);

		if (savedInstanceState == null) {
			selectItem(0);
		}
	}

	@Override
	public void onBackPressed() {
		if (drawer.isDrawerOpen(GravityCompat.START)) {
			drawer.closeDrawer(GravityCompat.START);
		} else {
//			super.onBackPressed();
		}
	}

	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
		selectItem(item.getOrder());
		getSupportActionBar().setTitle(item.getTitle());
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}

	private void selectItem(int position) {
		Fragment fragment;
		switch (position) {
			case 0:
				fragment = new ConcentratesFragment();
				break;
			case 1:
				fragment = new LiqueursFragment();
				break;
			case 2:
				fragment = new SyrupsFragment();
				break;
			case 3:
				fragment = new TextFragment();
				break;
			default:
				fragment = new ImageFragment();
		}
		FragmentTransaction ft = fragmentManager.beginTransaction();
		ft.replace(R.id.content, fragment);
		ft.addToBackStack(null);
		ft.commit();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (drawerToggle.onOptionsItemSelected(item)) {
			return true;
		} else {
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	protected void onPostCreate(@Nullable Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		drawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		drawerToggle.onConfigurationChanged(newConfig);
	}
}
