package classwork.lesson170907;

import java.util.stream.IntStream;

public class Recursion {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
	
		print(1,10);
		
		printFrome1To(10);
		printFromeITo1(10);
		
	}

	private static void printFromeITo1(int i) {
		if(i < 1) {
			return;
		}
		System.out.println(i);
		printFrome1To(i-1);
	}

	private static void printFrome1To(int i) {
		if(i < 1) {
			return;
		}
		printFrome1To(i-1);
		System.out.println(i);
	}

	private static void print(int start, int end) {
		if(start > end) {
			return;
		}
		System.out.println(start);
		print(start+1, end);
	}
	
	
}
