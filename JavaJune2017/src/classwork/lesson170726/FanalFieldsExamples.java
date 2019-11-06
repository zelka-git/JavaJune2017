package classwork.lesson170726;

public class FanalFieldsExamples {

	public static void main(String[] args) {
		
		A a = new A();
		
	}
	
}


class A {
	final int x = 10;
	final int y;
	final int z;
	
	{
		y = 20;
	}
	
	
	public A() {
		z = 30;
	}
}

class B{
//	final int k;
}

class C extends B{
//	k = 10;
}
