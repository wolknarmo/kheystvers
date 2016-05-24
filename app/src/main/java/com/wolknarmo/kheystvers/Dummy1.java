package com.wolknarmo.kheystvers;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Dummy1 extends ItemsListFragment {

	private List<Drawable> dummyStuff1 = new ArrayList<>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		dummyStuff1.add(getResources().getDrawable(R.mipmap.s1));
		dummyStuff1.add(getResources().getDrawable(R.mipmap.s2));
		dummyStuff1.add(getResources().getDrawable(R.mipmap.s3));
		dummyStuff1.add(getResources().getDrawable(R.mipmap.s42));
		dummyStuff1.add(getResources().getDrawable(R.mipmap.s42));
		dummyStuff1.add(getResources().getDrawable(R.mipmap.s42));
		dummyStuff1.add(getResources().getDrawable(R.mipmap.s42));
		this.adapter = new MyAdapter(getResources().getStringArray(R.array.syrups), dummyStuff1);
	}
}
