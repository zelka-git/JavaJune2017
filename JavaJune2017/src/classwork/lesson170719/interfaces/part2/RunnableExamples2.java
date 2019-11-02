package classwork.lesson170719.interfaces.part2;

public class RunnableExamples2 {
	public static void main(String[] args) {
		
		Runnable task = new Task();
		
		Thread thread = new Thread(task);
		
		thread.start();
		
		task.run();
	}
}


