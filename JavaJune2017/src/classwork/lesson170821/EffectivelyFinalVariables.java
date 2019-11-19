package classwork.lesson170821;

public class EffectivelyFinalVariables {
	
	static int z = 1000;

	public static void main(String[] args) {
		
		int x = 10;
		final int y = 20;
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				//int x = main.x; CAPTURE
				pause(25000);
				System.out.println(x + y);
				z = 3000;
			}

		};
		
//		x = 30; DO NOT DO IT!
		
		new Thread().start();
		pause(10000);
		System.out.println("finish");
		
//		process(r);
	}

	private static void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private static void process(Runnable r) {
		
	}
	
}
