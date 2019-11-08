package classwork.lesson170731;

public class SimpleFinallyExample {

	public static void main(String[] args) {
		try {
			process();			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void process() {
		System.out.println("start");
		try {
			System.out.println("before");
			internel();
			System.out.println("after");
		} finally {
			System.out.println("finally");
		}
		System.out.println("finish");
	}

	private static void internel() {
		throw new RuntimeException();
	}
	
}
