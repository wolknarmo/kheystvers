package com.wolknarmo.kheystvers;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LiqueursFragment extends ItemListFragment {

	private List<Drawable> images = new ArrayList<>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		images.add(getResources().getDrawable(R.mipmap.s0));
		images.add(getResources().getDrawable(R.mipmap.s1m));
		images.add(getResources().getDrawable(R.mipmap.s1mm));
		images.add(getResources().getDrawable(R.mipmap.sg));
		images.add(getResources().getDrawable(R.mipmap.sg));
		images.add(getResources().getDrawable(R.mipmap.sg));
		images.add(getResources().getDrawable(R.mipmap.sg));
		this.adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.liqueurs), images, getResources().getStringArray(R.array.liqueurs_description));
	}
}
