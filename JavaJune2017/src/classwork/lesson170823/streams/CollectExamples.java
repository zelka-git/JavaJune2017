package classwork.lesson170823.streams;

import java.util.HashSet;
import java.util.stream.Stream;

public class CollectExamples {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("b","a", "n","a","n","a");
		
//		Supplier<StringBuilder> sbSupplier = StringBuilder::new;
//		
//		BiConsumer<StringBuilder, String> accumulator = StringBuilder::append;
//		
////		BiConsumer<StringBuilder, StringBuilder> combiner = (sb1, sb2) -> sb1.append(sb2);
//		BiConsumer<StringBuilder, StringBuilder> combiner = StringBuilder::append;
//		
//		stream.collect(sbSupplier, accumulator, combiner);

		StringBuilder string = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(string);

		
		Stream<String> stream2 = Stream.of("b","a", "n","a","n","a");
		
		HashSet<String> collect = stream2.collect(HashSet::new, HashSet::add, HashSet::addAll);
		
		System.out.println(collect);
		
	}
	
}
