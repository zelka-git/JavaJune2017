package classwork.lesson170726;

abstract public class Furniture implements Clenable {
	@Override
	public void takeApart() {
		
	}
	@Override
	public void combine() {
		
	}
}

interface Clenable{
	default void clean() {
		takeApart();
		System.out.println("cleaning parts");
		combine();
	}

	void combine();

	void takeApart();
}

class Table extends Furniture {
	
}

class Chair extends Furniture {
	
}
