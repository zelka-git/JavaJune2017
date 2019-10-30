package classwork.lesson170714.inheritance.part2;

public class Rat extends Rodent {
	@Override
	protected void makeSound() {
		teethClac();
		super.makeSound();
		teethClac();
		
	}
	
	@Override
	protected void eat() {
		System.out.println("grab-n-run");
	}
	
	private void teethClac() {
		System.out.println("clac - clac");	
	}
}
