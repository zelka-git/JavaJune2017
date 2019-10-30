package classwork.lesson170714.inheritance.part2;

import java.util.Arrays;
import java.util.List;

public class HomeBot {
	public static void main(String[] args) {
		List<Pet> pets = Arrays.asList(new Dog(), new Cat(), new Hamster());
		for (Pet pet : pets) {
			pet.feed();
		}
		
		Rat rat = new Rat();
		rat.feed();
	}
}
