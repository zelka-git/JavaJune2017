package classwork.lesson170714.inheritance.part2;

public class Dog extends Pet {
	@Override
	protected void eat() {
		System.out.println("eat fast and eager");
	}
	
	@Override
	protected void makeSound() {
		System.out.println("bark");
	}
}
