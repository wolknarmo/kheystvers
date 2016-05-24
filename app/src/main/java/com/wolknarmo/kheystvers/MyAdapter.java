package com.wolknarmo.kheystvers;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
	private String[] titles;
	private List<Drawable> pics;

	// Provide a suitable constructor (depends on the kind of dataset)
	public MyAdapter(String[] myDataset, List<Drawable> myPics) {
		titles = myDataset;
		pics = myPics;
	}

	// Create new views (invoked by the layout manager)
	@Override
	public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		// create a new view

		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
		// set the view's size, margins, paddings and layout parameters
		ViewHolder vh = new ViewHolder((CardView) v, new ViewHolder.IMyViewHolderClicks() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(view.getContext(), ItemDetail.class);
				view.getContext().startActivity(intent);
			}
		});
		return vh;
	}

	// Replace the contents of a view (invoked by the layout manager)
	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		// - get element from your dataset at this position
		// - replace the contents of the view with that element
		TextView textView = (TextView) holder.mCardView.findViewById(R.id.title);
		textView.setText(titles[position]);
		ImageView imageView = (ImageView) holder.mCardView.findViewById(R.id.image);
		imageView.setImageDrawable(pics.get(position));

	}

	// Return the size of your dataset (invoked by the layout manager)
	@Override
	public int getItemCount() {
		return titles.length;
	}

	// Provide a reference to the views for each data item
	// Complex data items may need more than one view per item, and
	// you provide access to all the views for a data item in a view holder
	public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
		// each data item is just a string in this case
		public CardView mCardView;
		public IMyViewHolderClicks listener;

		public ViewHolder(CardView v, IMyViewHolderClicks l) {
			super(v);
			mCardView = v;
			listener = l;
			mCardView.setOnClickListener(this);
		}

		@Override
		public void onClick(View view) {
			listener.onClick(view);
		}

		public interface IMyViewHolderClicks {
			void onClick(View view);
		}
	}
}