package classwork.lesson170728.exceptions;

public class Example2 {
	
	private static final int DEFAULT_PAUSE_IN_SECONDS = 5;

	public static void main(String[] args) {
//		pause();
	}

	private static void pause() throws InterruptedException {
		pause(DEFAULT_PAUSE_IN_SECONDS);
	}

	private static void pause(int i) throws InterruptedException {
		Thread.sleep(i * 1000);
	}
	
}
