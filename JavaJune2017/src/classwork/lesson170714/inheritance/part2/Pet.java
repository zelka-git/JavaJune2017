package classwork.lesson170714.inheritance.part2;

public abstract class Pet extends Mammal {
	public void feed() {
		makeSound();
		eat();
		makeSound();
	}

	protected void eat() {	
	}

	protected void makeSound() {		
	}
}
