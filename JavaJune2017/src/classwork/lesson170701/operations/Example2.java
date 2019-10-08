package classwork.lesson170701.operations;

public class Example2 {
	public static void main(String[] args) {
		process("Hello");
	}

	private static void process(String s) {
		if (s != null && s.length() > 0) {
			System.out.println(s);
		}
		
	}
}
