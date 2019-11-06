package classwork.lesson170726.outer;

import classwork.lesson170726.Special;

public class UseSpecial {
	public static void main(String[] args) {
		Special special = Special.createDefaultImpl();
		special.doSomethingExaption();
		Special special2 = Special.createDefaultImpl();
		
		System.out.println(special);
		System.out.println(special2);
		
		Special.A a = new Special.A();
		
//		Special.special = null; ERROR!! field special is final
	}
}
