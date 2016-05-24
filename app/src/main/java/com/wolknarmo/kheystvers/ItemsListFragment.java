package com.wolknarmo.kheystvers;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ItemsListFragment extends Fragment {

	protected RecyclerView recyclerView;
	protected MyAdapter adapter;
	protected View rootView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.list, container, false);
		recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
		recyclerView.setAdapter(adapter);
		return rootView;

	}
}
