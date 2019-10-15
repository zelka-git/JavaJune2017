package classwork.lesson170704;

import java.util.ArrayList;

public class ArrayListExamples {
	public static void main(String[] args) {
		ArrayList<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("one");
		listOfStrings.add("two");
		listOfStrings.add("two");
		listOfStrings.add("three");
		listOfStrings.add("four");
		
		System.out.println(listOfStrings);
		listOfStrings.remove(1);
		System.out.println(listOfStrings);
	}
}
