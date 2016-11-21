package com.wolknarmo.kheystvers;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
	private List<Item> items;

	public RecyclerViewAdapter(List<Item> items) {
		this.items = items;
	}

	@Override
	public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new ViewHolder((CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false));
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		TextView title = (TextView) holder.mCardView.findViewById(R.id.title);
		title.setText(items.get(position).title);
		ImageView image = (ImageView) holder.mCardView.findViewById(R.id.image);
		image.setImageDrawable(items.get(position).image);
		TextView description = (TextView) holder.mCardView.findViewById(R.id.description);
		description.setText(items.get(position).description);
	}

	@Override
	public int getItemCount() {
		return items.size();
	}

	class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

		CardView mCardView;

		ViewHolder(CardView v) {
			super(v);
			mCardView = v;
			mCardView.setOnClickListener(this);
		}

		@Override
		public void onClick(View view) {
			TextView description = (TextView) view.findViewById(R.id.description);
			TextView title = (TextView) view.findViewById(R.id.title);
			ImageView image = (ImageView) view.findViewById(R.id.image);
			Intent intent = new Intent(view.getContext(), DetailActivity.class);
			intent.putExtra("title", title.getText());
			intent.putExtra("description", description.getText());
			image.buildDrawingCache();
			intent.putExtra("image", image.getDrawingCache());
//			image.destroyDrawingCache();
			view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation((Activity)view.getContext(), image, "toolbar_image").toBundle());
		}
	}
}