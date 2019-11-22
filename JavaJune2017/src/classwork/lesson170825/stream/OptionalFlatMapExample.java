package classwork.lesson170825.stream;

import java.util.Optional;

public class OptionalFlatMapExample {

	public static void main(String[] args) {
		
		Integer n = null;
		
		Optional<Integer> opInteger = Optional.ofNullable(n);
		
		String s = null;
		
		Optional<String> ofString = Optional.ofNullable(s);
		
		Optional<Integer> opInt = ofString.map(String::length);
		
		
		
		
	}
	
}
