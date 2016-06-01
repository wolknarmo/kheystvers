package com.wolknarmo.kheystvers;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment {

	private View rootView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.text, container, false);
		TextView textView = (TextView) rootView.findViewById(R.id.text);
		textView.setText("WOW!! SUCH FRAGMENT! MANY VIEWS! LOVE, DOGE");
		textView.setTextSize(50);
		return rootView;
	}
}
