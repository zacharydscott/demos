package com.revature.day2;

public class Fish extends Pet {
	private String species;
	private int numberFins;

	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, String owner) {
		super(name, owner);
		// TODO Auto-generated constructor stub
	}

	public Fish(String species, int numberFins, String name, String owner) {
		this(name, owner);
		this.species = species;
		this.numberFins = numberFins;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getNumberFins() {
		return numberFins;
	}

	public void setNumberFins(int numberFins) {
		this.numberFins = numberFins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberFins;
		result = prime * result + ((species == null) ? 0 : species.hashCode());
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
		Fish other = (Fish) obj;
		if (numberFins != other.numberFins)
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fish [species=" + species + ", numberFins=" + numberFins + "]";
	}

	@Override
	public String speak() {
		return "bubble";
	}

}
