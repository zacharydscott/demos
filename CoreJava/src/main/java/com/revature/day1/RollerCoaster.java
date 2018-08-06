package com.revature.day1;

public class RollerCoaster {
	private int numberCarts;
	private double rating;
	private int maxCapacity;
	private String name;

	public RollerCoaster(int numberCarts, double rating, int maxCapacity, String name) {
		super();
		this.numberCarts = numberCarts;
		this.rating = rating;
		this.maxCapacity = maxCapacity;
		this.name = name;
	}

	public int getNumberCarts() {
		return numberCarts;
	}

	public void setNumberCarts(int numberCarts) {
		this.numberCarts = numberCarts;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
