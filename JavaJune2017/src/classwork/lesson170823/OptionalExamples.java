package classwork.lesson170823;

import java.util.Optional;
import java.util.Random;

public class OptionalExamples {
	
	final static Random r = new Random();

	public static void main(String[] args) {
		
		Optional<String> opt = Optional.empty();
		
		Optional<String> opt1 = compute();
		
		String s = opt1.get();
		String s2 = opt1.orElse(getDefaultValue());
		String s3 = opt1.orElseGet(OptionalExamples::getDefaultValue);
		
	}
	private static String getDefaultValue() {
		// TODO Auto-generated method stub
		return null;
	}
	static public Optional<String> compute() {
		return Optional.ofNullable(r.nextBoolean() ? "hello" : null);
	}
	
	
}
