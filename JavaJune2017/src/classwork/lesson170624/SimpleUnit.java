package classwork.lesson170624;

public class SimpleUnit {

	public static boolean assertEqual(String actual, String expected) {
		//FIXME 
		boolean equals = actual.equals(expected);
		if (!equals) {
			System.err.println("Test failed: expected " + expected + ", but actual " + actual);
		}
		return equals;
	}

	public static boolean assertNotEqual(String actual, String expected) {
		//FIXME 
		boolean notEquals = !actual.equals(expected);
		if (!notEquals) {
			System.err.println("Test failed: expected NOT " + expected + ", but actual " + actual);		
		}
		return notEquals;
	}

	public static boolean assertEqual(int actual, int expected) {
		// TODO Auto-generated method stub
		boolean equals = actual == expected;
		if (!equals) {
			System.err.println("Test failed: expected " + expected + ", but actual " + actual);
		}
		return equals;
	}
	
	public static boolean assertNotEqual(int actual, int expected) {
		// TODO Auto-generated method stub
		boolean notEquals = actual != expected;
		if (!notEquals) {
			System.err.println("Test failed: expected NOT " + expected + ", but actual " + actual);
		}
		return notEquals;
	}

}
