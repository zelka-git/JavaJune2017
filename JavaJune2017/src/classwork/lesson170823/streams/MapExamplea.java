package classwork.lesson170823.streams;

import java.util.stream.Stream;

public class MapExamplea {

	public static void main(String[] args) {
		
		Stream.of("b","a", "n","a","n","a").map(s -> s.length()).forEach(System.out::print);
		System.out.println();
		
	}
	
}
