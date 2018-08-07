package com.revature.day2;

public class PetsLauncher {
	public static void main(String[] args) {
		Pet fido = new Dog("sharpie", 4, "Fido", "Justin");
		Dog d = (Dog) fido;
		if (fido instanceof Dog) {
			System.out.println(((Dog) fido).getBreed());
		}

		System.out.println(fido.getName());
		Fish nemo = new Fish("clown fish", 3, "Nemo", "Debbie");
		System.out.println(nemo.getName());

		Pet[] pets = new Pet[5];
		pets[0] = fido;
		pets[1] = nemo;
		pets[2] = new Dog("husky", 3, "Esteban", "Esteban");
		pets[3] = new Fish("swordfish", 5, "Ricky", "Mark");
		System.out.println("entering for loop");
		for (Pet p : pets) {
			if (p != null) {
				System.out.println(p.speak());
			}
		}
	}
}
