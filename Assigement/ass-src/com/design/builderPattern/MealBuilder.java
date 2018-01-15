package com.design.builderPattern;

public class MealBuilder {
	
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.add(new VegBurger());
		meal.add(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.add(new ChickenBurger());
		meal.add(new Pepsi());
		return meal;
	}
	
}
