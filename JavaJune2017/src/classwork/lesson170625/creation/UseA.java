package classwork.lesson170625.creation;

public class UseA {
	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a);
		B b = new B();
		C c = new C();
		c.C();
		Singleton.get().doIt();
		new Z();
		new Z();
		
		WholePicture a = new WholePicture();
	}

}
