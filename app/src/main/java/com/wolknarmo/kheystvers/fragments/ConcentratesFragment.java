package com.wolknarmo.kheystvers.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.wolknarmo.kheystvers.R;
import com.wolknarmo.kheystvers.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class ConcentratesFragment extends ItemListFragment {

	private List<Drawable> images = new ArrayList<>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		images.add(getResources().getDrawable(R.mipmap.s1k));
		images.add(getResources().getDrawable(R.mipmap.s10k));
		images.add(getResources().getDrawable(R.mipmap.s65536));
		images.add(getResources().getDrawable(R.mipmap.s100k));
		images.add(getResources().getDrawable(R.mipmap.s100k));
		images.add(getResources().getDrawable(R.mipmap.s100k));
		images.add(getResources().getDrawable(R.mipmap.s100k));
		this.adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.concentrates), images, getResources().getStringArray(R.array.concentrates_descriptions));
	}
}
