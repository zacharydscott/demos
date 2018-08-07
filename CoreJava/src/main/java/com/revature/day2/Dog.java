package com.revature.day2;

public class Dog extends Pet {
	private String breed;
	private int numberLegs;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String owner) {
		super(name, owner);
		// TODO Auto-generated constructor stub
	}

	public Dog(String breed, int numberLegs, String name, String owner) {
		this(name, owner);
		this.breed = breed;
		this.numberLegs = numberLegs;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getNumberLegs() {
		return numberLegs;
	}

	public void setNumberLegs(int numberLegs) {
		this.numberLegs = numberLegs;
	}

	@Override
	public String getName() {
		return "dog: " + super.getName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + numberLegs;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (numberLegs != other.numberLegs)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", numberLegs=" + numberLegs + ", getName()=" + getName() + ", getOwner()="
				+ getOwner() + "]";
	}

	@Override
	public String speak() {
		return "Bark";
	}

}
