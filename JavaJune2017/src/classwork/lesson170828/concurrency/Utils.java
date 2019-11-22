package classwork.lesson170828.concurrency;

public class Utils {

	static void pause() {
		pause(1000);
	}
	static void pause(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	
}
