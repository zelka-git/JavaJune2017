package classwork.lesson170825.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class PrimitiveStreamsExamples {

	public static void main(String[] args) {
		IntStream intStream = IntStream.rangeClosed(1, 10);
		
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		
		printStats(intStream);
		
	}

	private static void printStats(IntStream intStream) {
//		int sum = IntStream.rangeClosed(1, 10).sum();
//		long count = IntStream.rangeClosed(1, 10).count();
//		OptionalDouble average = IntStream.rangeClosed(1, 10).average();
		IntSummaryStatistics summaryStatistics = intStream.summaryStatistics();
		System.out.println(summaryStatistics);
	}
	
}
