package com.wolknarmo.kheystvers;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Dummy2 extends ItemsListFragment {

	private List<Drawable> dummyStuff2 = new ArrayList<>();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		dummyStuff2.add(getResources().getDrawable(R.mipmap.s1k));
		dummyStuff2.add(getResources().getDrawable(R.mipmap.s10k));
		dummyStuff2.add(getResources().getDrawable(R.mipmap.s65536));
		dummyStuff2.add(getResources().getDrawable(R.mipmap.s100k));
		dummyStuff2.add(getResources().getDrawable(R.mipmap.s100k));
		dummyStuff2.add(getResources().getDrawable(R.mipmap.s100k));
		dummyStuff2.add(getResources().getDrawable(R.mipmap.s100k));
		this.adapter = new MyAdapter(getResources().getStringArray(R.array.syrups2), dummyStuff2);
	}
}
