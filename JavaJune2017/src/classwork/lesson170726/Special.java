package classwork.lesson170726;

public interface Special {

	class A{
		
	}
	
	Special special = new Special() {
		@Override
		public void doSomethingExaption() {
			System.out.println("I am exceptional!");
		}
	};
	static Special createDefaultImpl() {
		return special;
	}
	
	void doSomethingExaption();
	
}
