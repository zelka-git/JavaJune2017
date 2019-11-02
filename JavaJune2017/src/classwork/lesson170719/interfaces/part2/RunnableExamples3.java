package classwork.lesson170719.interfaces.part2;

public class RunnableExamples3 {
	public static void main(String[] args) {
		
		Runnable task = () -> {
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
		};
		
		Thread thread = new Thread(task);
		thread.start();
		task.run();
	}
}


