package classwork.lesson170825.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlamMap2 {

	public static void main(String[] args) {
		List<String> empty = Arrays.asList();

		List<String> list1 = Arrays.asList("one", "two", "three");
		
		List<String> list2 = Arrays.asList("один", "два", "три");
		
		Stream<List<String>> stresmOfLists = Stream.of(list1, empty, list2);
		
//		stresmOfLists.map(list -> list.stream());
		Stream<String> streamOfStrings = stresmOfLists.flatMap(list -> list.stream());
		List<String> words = streamOfStrings.collect(Collectors.toList());
		System.out.println(words);
		
	}
	
}
