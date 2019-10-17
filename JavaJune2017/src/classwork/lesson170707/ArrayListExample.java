package classwork.lesson170707;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	static List<String> listOfStrings = new ArrayList<>();
	public static void main(String[] args) {
		listOfStrings.add("one");
		listOfStrings.add("two");
		listOfStrings.add("two");
		listOfStrings.add("three");
		listOfStrings.add("four");
		
		System.out.println(listOfStrings);
		
		listOfStrings.remove(1);
		
		System.out.println(listOfStrings);
		
		System.out.println(listOfStrings.get(1));
		System.out.println(listOfStrings.size());
		
		String[] arrayOfString = {"один", "два", "три","четыре"};
		
		System.out.println(arrayOfString);
		
		listOfStrings.set(2, "THREE");
		
		System.out.println(listOfStrings);
		
		arrayOfString[2] = "ТРИ";
		
		System.out.println(Arrays.toString(arrayOfString));
		
		boolean success = listOfStrings.remove("four");
		System.out.println(listOfStrings + " " + success);
	}
}
