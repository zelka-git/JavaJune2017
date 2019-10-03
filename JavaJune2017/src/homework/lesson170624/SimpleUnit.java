package homework.lesson170624;

public class SimpleUnit {
	
	public static boolean assertEqual(String actual, String expected) {
	boolean equals = actual.contentEquals(expected);
		if(!equals) {
			System.err.println("Test faild: expected " + expected + ", but actual " + actual);
			
		}
		return equals;
	}
	
	public static boolean assertNotEquals(String actual, String expected) {
		boolean notEquals = !actual.contentEquals(expected);
		if(!notEquals) {
			System.out.println("Test failed: expected NOT " + expected + ", but actual  " + actual);
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

	public static boolean assertEqual(boolean actual, boolean expected) {
		boolean equals = actual == expected;
		if (!equals) {
			System.err.println("Test failed: expected " + expected + ", but actual " + actual);
		}
		return equals;
	}
	
	public static boolean assertNotEqual(boolean actual, boolean expected) {
		boolean notEquals = actual != expected;
		if (!notEquals) {
			System.err.println("Test failed: expected NOT " + expected + ", but actual " + actual);
		}
		return notEquals;
	}
	

}
