package com.wolknarmo.kheystvers;


import android.graphics.drawable.Drawable;

public class Item {

	public String title;
	public String description;
	public Drawable image;

	public Item(String title, String description, Drawable image) {
		this.title = title;
		this.description = description;
		this.image = image;
	}
}
