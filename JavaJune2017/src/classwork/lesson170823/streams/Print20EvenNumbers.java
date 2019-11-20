package classwork.lesson170823.streams;

import java.util.stream.Stream;

public class Print20EvenNumbers {

	public static void main(String[] args) {
		Stream.iterate(0, n -> n + 2).limit(20).forEach(System.out::println);
		
		for (int i = 0; i < 40; i+=2) {
			System.out.println(i);
		}
	}
	
}
