package com.wolknarmo.kheystvers.fragments;

import android.os.Bundle;

import com.wolknarmo.kheystvers.Item;
import com.wolknarmo.kheystvers.R;
import com.wolknarmo.kheystvers.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SyrupsFragment extends ItemListFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.adapter = new RecyclerViewAdapter(initializeItems());
	}

	private List<Item> initializeItems() {
		List<Item> syrups = new ArrayList<>();
		for (int i = 0; i < getResources().getStringArray(R.array.syrups).length; i++) {
			syrups.add(new Item(getResources().getStringArray(R.array.syrups)[i], getResources().getStringArray(R.array.syrups_descriptions)[i], getResources()
					.obtainTypedArray(R.array.syrups_images)
					.getDrawable(i)));
		}
		return syrups;
	}
}
