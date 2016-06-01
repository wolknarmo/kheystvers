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

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
	private String[] titles;
	private List<Drawable> images;
	private String[] descriptions;

	public RecyclerViewAdapter(String[] titles, List<Drawable> images, String[] descriptions) {
		this.titles = titles;
		this.images = images;
		this.descriptions = descriptions;
	}

	@Override
	public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
		ViewHolder vh = new ViewHolder((CardView) v, new ViewHolder.OnViewHolderClickInterface() {
			@Override
			public void onClick(View view) {
				TextView description = (TextView) view.findViewById(R.id.description);
				TextView title = (TextView) view.findViewById(R.id.title);
				Intent intent = new Intent(view.getContext(), DetailActivity.class);
				intent.putExtra("title", title.getText());
				intent.putExtra("description", description.getText());
				view.getContext().startActivity(intent);
			}
		});
		return vh;
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		TextView title = (TextView) holder.mCardView.findViewById(R.id.title);
		title.setText(titles[position]);
		ImageView image = (ImageView) holder.mCardView.findViewById(R.id.image);
		image.setImageDrawable(images.get(position));
		TextView description = (TextView) holder.mCardView.findViewById(R.id.description);
		description.setText(descriptions[position]);
	}

	@Override
	public int getItemCount() {
		return titles.length;
	}

	public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

		public CardView mCardView;
		public OnViewHolderClickInterface listener;

		public ViewHolder(CardView v, OnViewHolderClickInterface l) {
			super(v);
			mCardView = v;
			listener = l;
			mCardView.setOnClickListener(this);
		}

		@Override
		public void onClick(View view) {
			listener.onClick(view);
		}

		public interface OnViewHolderClickInterface {
			void onClick(View view);
		}
	}
}