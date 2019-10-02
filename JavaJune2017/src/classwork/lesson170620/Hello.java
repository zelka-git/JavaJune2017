package classwork.lesson170620;

import java.io.Serializable;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		A a = new A();
		B b = new B();
		
		Object o = a;
		A x = b;
		Serializable s = b;
		((B)s).hashCode();
	}
	static class A implements Serializable{
		
	}
	static class B extends A{
		public void m() {
			
		}
	}
}
