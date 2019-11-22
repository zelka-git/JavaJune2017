package classwork.lesson170828.concurrency;

import java.awt.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExamples {

	public static void main(String[] args) {
//		ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		System.out.println("start");
		
		service.execute(()->{
			Utils.pause(3000);
			System.out.println("Hello, world 1!");
		});
		
		service.execute(()->{
			Utils.pause(3000);
			System.out.println("Hello, world 2!");
		});
		
		service.execute(()->{
			Utils.pause(3000);
			System.out.println("Hello, world 3!");
		});
		
		service.execute(()->{
			Utils.pause(3000);
			System.out.println("Hello, world 4!");
		});
		
		service.execute(()->{
			Utils.pause(3000);
			System.out.println("Hello, world 5!");
		});
		
//		service.shutdown();
		
		List taskLeft = (List) service.shutdownNow();
		
		System.out.println(taskLeft);
		
		System.out.println("finish");
		
	}
	
}
