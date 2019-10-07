package classwork.lesson170629.classtructure;

public class A {
	//class
	static final int MAX = 10;
	static final String SECRET_WORD = "Hello";
	static int instanceCounter = 0;
	static {
		
	}
	public static int compare(A first, A second) {
		return first.x - second.y;
	}
	//instance
	int x;
	int y;
	
	{
		instanceCounter++;
	}
	public A() {
		x = 10;
		y = 10;
	}
	
	public void move(int shiftX, int shiftY) {
		x += shiftX;
		y += shiftY;
	}
	
	public int compare(A other) {
//		return this.x - other.x;
		return compare(this, other);
	}
}
