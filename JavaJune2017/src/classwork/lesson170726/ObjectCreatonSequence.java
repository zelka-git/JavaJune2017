package classwork.lesson170726;

public class ObjectCreatonSequence {

	public static void main(String[] args) {
		new A1();
		new B1();
	}
	
}
class A1{
	{
		System.out.println(" init A1 ");
	}
	A1(){
		System.out.println("constructor A1");
	}
}
class B1 extends A1{
	{
		System.out.println(" init B1");
	}
	B1(){
		System.out.println("constructor B1");
	}
}