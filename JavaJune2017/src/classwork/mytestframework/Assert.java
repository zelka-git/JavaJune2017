package classwork.mytestframework;

public class Assert {

	public static boolean assertEqual(String actual, String expected) {
		boolean equals;
		if (actual == null) {
			equals = actual == expected;
		}else {			
			equals = actual.equals(expected);
		}
		if (!equals) {
			System.err.println("Test failed: expected '" + expected + "', but actual '" + actual + "'");
		}
		return equals;
	}

	public static boolean assertNotEqual(String actual, String expected) {
		boolean notEquals;
		if(actual == null) {
			notEquals = actual != expected;
		}else {
			notEquals = !actual.equals(expected);
		}
		if (!notEquals) {
			System.err.println("Test failed: expected NOT '" + expected + "', but actual '" + actual + "'");		
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
		if(!equals) {
			System.err.println("Test failed: expected " + expected + ", but actual" + actual);
		}
		return equals;
	}

	public static boolean assertNotEqual(boolean actual, boolean expected) {
		boolean notEquals = actual != expected;
		if(!notEquals) {
			System.err.println("Test failed: expected NOT " + expected + ", but actual" + actual);
		}
		return notEquals;
	}

}
