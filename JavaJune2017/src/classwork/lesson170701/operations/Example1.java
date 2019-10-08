package classwork.lesson170701.operations;

public class Example1 {
	public static void main(String[] args) {
		Object o = new String();
		prosecc(o);
	}

	private static void prosecc(Object o) {
		if ( o instanceof String) {
			System.out.println(((String)o).length());
		}
		
	}
}
