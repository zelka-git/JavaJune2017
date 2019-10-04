package classwork.lesson170625.creation;

public class Singleton {
	
	static private Singleton instance = new Singleton();
	private Singleton() {
		
	}
	static public Singleton get() {
		return instance;
	}
	public void doIt() {
		System.out.println("did it");
	}
}
