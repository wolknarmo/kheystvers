package com.wolknarmo.kheystvers.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wolknarmo.kheystvers.R;

public class TextFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		TextView textView = (TextView) inflater.inflate(R.layout.text, container, false);
		textView.setText("WOW!! SUCH FRAGMENT! MANY VIEWS! LOVE, DOGE");
		textView.setTextSize(50);
		return textView;
	}
}
