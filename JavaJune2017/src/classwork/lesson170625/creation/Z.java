package classwork.lesson170625.creation;

public class Z {
	static {
		System.out.println("static init");
	}
	
	long timestamp = System.currentTimeMillis(); 
	{			
		System.out.println("init");
	}
	Z(){
		System.out.println("cons");
	}
}
