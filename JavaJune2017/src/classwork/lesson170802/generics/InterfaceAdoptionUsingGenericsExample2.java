package classwork.lesson170802.generics;

public class InterfaceAdoptionUsingGenericsExample2 {
	
}

class D{
	
}
class E{
	
}

class Z implements Makeable<D>{
	@Override
	public void doSomethngWith(D a) {
		// TODO Auto-generated method stub
		
	}

}


class W implements Makeable{

	@Override
	public void doSomethngWith(Object a) {
		// TODO Auto-generated method stub
		
	}

}

interface Makeable<T> {
	 void doSomethngWith(T a);
}
