package classwork.lesson170714.inheritance;

public class Sample {

	public static void main(String[] args) {
		
		Class<Sample> c = Sample.class;
		
		Sample sample = new Sample();
		
//		a.
		
		Object o = new Object();
//		o.
		
		E e = new E();
		e.m();
		
		A a = new A();
		a = new A();
		a = new B();
		a = new C();
		a = new D();
		a = new E();
		
	}
	
}
