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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxCapacity;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberCarts;
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RollerCoaster other = (RollerCoaster) obj;
		if (maxCapacity != other.maxCapacity)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberCarts != other.numberCarts)
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RollerCoaster [numberCarts=" + numberCarts + ", rating=" + rating + ", maxCapacity=" + maxCapacity
				+ ", name=" + name + "]";
	}
	
}
