package com.design.builderPattern;

import java.util.ArrayList;

public class Meal {
	private ArrayList<Item> items = new ArrayList<>();
	
	public void add(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.println("Item " + item.name());
			System.out.println("Packing " + item.packing().pack());
			System.out.println("Price " + item.price());
		}
	}
}
