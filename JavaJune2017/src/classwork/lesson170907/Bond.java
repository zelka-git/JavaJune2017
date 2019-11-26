package classwork.lesson170907;

public class Bond {

	private static int price = 5;
	public boolean sell() {
		if (price < 10) {
			price++;
			return true;
		}else if(price >= 10) {
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		new Bond().sell();
		new Bond().sell();
		new Bond().sell();
		System.out.println(price);
	}
	
}
