package oopsconceptprograms;

class Animal {
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound();

		Dog dog = new Dog();
		dog.makeSound();
		
		// Upcasting: Assigning a Dog object to an Animal reference
		Animal anotherAnimal = new Dog();
		anotherAnimal.makeSound();
	}
}
