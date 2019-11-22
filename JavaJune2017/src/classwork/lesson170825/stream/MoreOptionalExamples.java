package classwork.lesson170825.stream;

import java.util.Optional;

public class MoreOptionalExamples {

	public static void main(String[] args) {
		
		System.out.println(hasThreeDigit(null));
		System.out.println(hasThreeDigit(0));
		System.out.println(hasThreeDigit(99));
		System.out.println(hasThreeDigit(100));
		System.out.println(hasThreeDigit(1000));
		System.out.println(hasThreeDigit(-100));
		
	}
	
//	static public boolean hasThreeDigit(Integer n) {
//		if( n == null) {
//			return false;
//		}
//		
//		String s = Integer.toString(n);
//		
//		
//		return s.length() == 3;
//	}

	static public boolean hasThreeDigit(Integer n) {
		return Optional.ofNullable(n).map(x -> Integer.toString(x)).filter(s -> s.length() == 3).isPresent();
		
		
	
	}
	
}
