package classwork.lesson170624;

public class Equals {
	public static void main(String[] args) {
		String a;
		String b;
		int i = 10;
		if(0 == i) {}
		if(i == 0) {}
			
		сompare(null);
	}

	private static void сompare(String a) {
		if("Hello".equals(a)) {
			System.out.println("Equals");
		}
	}
}
