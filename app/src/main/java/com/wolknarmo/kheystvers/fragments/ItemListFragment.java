package com.wolknarmo.kheystvers.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wolknarmo.kheystvers.R;
import com.wolknarmo.kheystvers.RecyclerViewAdapter;

public class ItemListFragment extends Fragment {

	protected RecyclerView recyclerView;
	protected RecyclerViewAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		recyclerView = (RecyclerView) inflater.inflate(R.layout.list, container, false);
		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
		recyclerView.setAdapter(adapter);
		return recyclerView;
	}
}
