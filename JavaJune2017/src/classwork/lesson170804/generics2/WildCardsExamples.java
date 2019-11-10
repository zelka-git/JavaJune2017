package classwork.lesson170804.generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardsExamples {

	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(1,2,3);
		List<Double> doubles = Arrays.asList(1.2, 2.4, 3.5);
		
		
//	List<Number> nums = ints;
		
		printNumbers(ints);
		printNumbers(doubles);
		
		List<Number>  nums = new ArrayList<>();
		
		List<Integer> ints2;
		
		fill(nums);
//		fill(ints2);
		
	}

	private static void fill(List<? super Number> nums) { 
		//Lower bound, Store is allowed
		nums.add(1.36);
	}

	private static void printNumbers(List<? extends Number> nums) {// Upper bound EXTract is allowed
		for (Number number : nums) {
			System.out.println(number);
		}
//		nums.add(1.45); Store operation is forbidden
	}
	
}
