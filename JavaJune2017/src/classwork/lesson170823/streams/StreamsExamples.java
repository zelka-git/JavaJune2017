package classwork.lesson170823.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExamples {

	public static void main(String[] args) {
		Stream<String> stream = Stream.empty();
		Stream<Integer> stream2 = Stream.of(1);
		Stream<Integer> stream3 = Stream.of(0,1,2,3,4,5,6,7,8,9);
		
		List<String> list = Arrays.asList("one","two","three");
		
		Stream<String> stream4 = list.stream();
		
		count(stream);
		count(stream2);
		count(stream3);
		count(stream4);
		
		System.out.println(Stream.generate(Math::random).limit(20).count());
		
		Stream.generate(Math::random).limit(20).forEach(System.out::println);
		
		Optional<String> any = Stream.<String>empty().findAny();
		
		System.out.println(any);
		
		any.ifPresent(System.out::println);
		
		Stream.of(0,1,2,3,4,5,6,7,8,9).findAny().ifPresent(System.out::println);

		boolean anyMatch = Stream.of(0,1,2,3,4,5,6,7,8,9).anyMatch(i -> i % 3 == 0);
		Stream.of(0,1,2,3,4,5,6,7,8,9).filter(i -> i % 3 == 0).forEach(System.out::println);
		
	}

	private static void count(Stream<?> stream) {
		long count = stream.count();
		
		System.out.println(count);
	}
	
}
