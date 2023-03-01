package edu.ntnu.idatt2001.lectures.decorator.food;

public abstract class FoodDecorator implements Food {
	private Food newFood;

	protected FoodDecorator(Food newFood) {
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		return newFood.prepareFood();
	}

	public double foodPrice() {
		return newFood.foodPrice();
	}
}