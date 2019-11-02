package classwork.lesson170719.interfaces.part2;

public class RunnableExamples {
	public static void main(String[] args) {
		Thread thread = new Thread(new Task());
		thread.start();
		new Task().run();
	}
}

class Task implements Runnable{

	public void run() {
		int count = 0;
		while (true) {
			System.out.println(count++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
