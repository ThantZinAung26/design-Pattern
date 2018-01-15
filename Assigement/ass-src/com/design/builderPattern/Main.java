package com.design.builderPattern;

public class Main {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non Veg Meal");
		nonVegMeal.showItems();
		
		
	}

}
