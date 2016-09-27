package com.wolknarmo.kheystvers.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.wolknarmo.kheystvers.R;
import com.wolknarmo.kheystvers.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SyrupsFragment extends ItemListFragment {

	private List<Drawable> images = new ArrayList<>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		images.add(getResources().getDrawable(R.mipmap.s1));
		images.add(getResources().getDrawable(R.mipmap.s2));
		images.add(getResources().getDrawable(R.mipmap.s3));
		images.add(getResources().getDrawable(R.mipmap.s42));
		images.add(getResources().getDrawable(R.mipmap.s42));
		images.add(getResources().getDrawable(R.mipmap.s42));
		images.add(getResources().getDrawable(R.mipmap.s42));
		this.adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.syrups), images, getResources().getStringArray(R.array.syrups_descriptions));
	}
}
