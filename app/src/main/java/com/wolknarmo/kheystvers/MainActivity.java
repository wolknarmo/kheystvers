package com.wolknarmo.kheystvers;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

	private FragmentManager fragmentManager;
//	private RecyclerView mRecyclerView;
//	private RecyclerView.Adapter mAdapter;
//	private RecyclerView.LayoutManager mLayoutManager;
//
//	private List<Drawable> dummyStuff1 = new ArrayList<>();
//	private List<Drawable> dummyStuff2 = new ArrayList<>();
//	private List<Drawable> dummyStuff3 = new ArrayList<>();
//
//	private MyAdapter dummyStuffAdapterOne;
//	private MyAdapter dummyStuffAdapterTwo;
//	private MyAdapter dummyStuffAdapterThree;

	Fragment f1;
	Fragment f2;
	Fragment f3;
	Fragment f4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		f1 = new Dummy1();
		f2 = new Dummy2();
		f3 = new TextFragment();
		f4 = new ImageFragment();
		fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction().replace(R.id.content, f1).commit();

//		mRecyclerView = (RecyclerView) findViewById(R.id.recycler_example);
//		LinearLayoutManager llm = new LinearLayoutManager(this);
//		mRecyclerView.setLayoutManager(llm);

//		mLayoutManager = new LinearLayoutManager(this);
//		mRecyclerView.setLayoutManager(mLayoutManager);

//		initDummyStuff();

//		dummyStuffAdapterOne = new MyAdapter(getResources().getStringArray(R.array.syrups), dummyStuff1);
//		dummyStuffAdapterTwo = new MyAdapter(getResources().getStringArray(R.array.syrups2), dummyStuff2);
//		dummyStuffAdapterThree = new MyAdapter(getResources().getStringArray(R.array.syrups3), dummyStuff3);

//		mAdapter = new MyAdapter(getResources().getStringArray(R.array.syrups), dummyStuff1);
//		mRecyclerView.setAdapter(dummyStuffAdapterOne);

		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(this);
	}

	@Override
	public void onBackPressed() {
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		if (drawer.isDrawerOpen(GravityCompat.START)) {
			drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}

	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
		if (item.getTitle().equals("Концентраты")) {
			fragmentManager.beginTransaction().replace(R.id.content, f1).commit();
		} else if (item.getTitle().equals("Ликеры")) {
			fragmentManager.beginTransaction().replace(R.id.content, f2).commit();
		} else if (item.getTitle().equals("Сиропы")) {
			fragmentManager.beginTransaction().replace(R.id.content, f3).commit();
		} else if (item.getTitle().equals("Как заказать")) {
			fragmentManager.beginTransaction().replace(R.id.content, f4).commit();
		} else if (item.getTitle().equals("Как получить")) {

		}

//		Fragment fragment = new ItemsListFragment();
//		Bundle args = new Bundle();
//		args.putString("itemTitle", item.getTitle().toString());
//		args.putInt("itemId", item.getItemId());
//		fragment.setArguments(args);

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}

//	private void initDummyStuff() {
//		dummyStuff1.add(getResources().getDrawable(R.mipmap.s1));
//		dummyStuff1.add(getResources().getDrawable(R.mipmap.s2));
//		dummyStuff1.add(getResources().getDrawable(R.mipmap.s3));
//		dummyStuff1.add(getResources().getDrawable(R.mipmap.s42));
//
//		dummyStuff2.add(getResources().getDrawable(R.mipmap.s1k));
//		dummyStuff2.add(getResources().getDrawable(R.mipmap.s10k));
//		dummyStuff2.add(getResources().getDrawable(R.mipmap.s65536));
//		dummyStuff2.add(getResources().getDrawable(R.mipmap.s100k));
//
//		dummyStuff3.add(getResources().getDrawable(R.mipmap.s1m));
//		dummyStuff3.add(getResources().getDrawable(R.mipmap.s1mm));
//		dummyStuff3.add(getResources().getDrawable(R.mipmap.sg));
//	}
}
