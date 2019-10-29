package classwork.lesson170712.encapsulation.part2;

import classwork.lesson170712.encapsulation.A;

public class HairOfA extends A {
	public static void main(String[] args) {
		A a = new A();
//		a.i = 0;//private - forbidden
//		a.j = 0; package - forbidden
//		a.k = 0; protected - forbidden
		a.m = 0;
		
		HairOfA hair = new HairOfA();
		
//		hair.i = 0;
//		hair.j = 0;
		hair.k = 0;
		hair.m = 0;
	}
}
