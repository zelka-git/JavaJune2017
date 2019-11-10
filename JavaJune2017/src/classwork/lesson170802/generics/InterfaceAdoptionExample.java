package classwork.lesson170802.generics;

public class InterfaceAdoptionExample {
	
}

abstract class A{
	
}

class B extends A{
	
}

class C extends A{
	
}
class X implements Doable{

	@Override
	public void doSomethngWith(A a) {
		// TODO Auto-generated method stub
		
	}
	
}
class Y implements Doable{

	@Override
	public void doSomethngWith(A a) {
		// TODO Auto-generated method stub
		
	}
	
}

interface Doable {
	void doSomethngWith(A a);
}
