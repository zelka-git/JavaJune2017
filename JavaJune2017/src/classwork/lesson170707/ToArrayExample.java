package classwork.lesson170707;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>() {
			{
				add("one");
				add("two");
				add("three");
			}
		};
		
		List<String> list2 = Arrays.asList("one", "two", "three");
//		list2.add("one");
//		list.remove("one");
		
		list2.set(0, "five");
		System.out.println(list2);
		
	}
}
