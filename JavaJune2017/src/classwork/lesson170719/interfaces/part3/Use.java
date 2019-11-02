package classwork.lesson170719.interfaces.part3;

public class Use {
public static void main(String[] args) {
	A a = new A();
	B b = new B();
	C c = new C();
	
	X x;
	Y y;
	Z z;
	
	z = c;
	y = b; y = c;
	x = a; a = b; x = c;
}
}
