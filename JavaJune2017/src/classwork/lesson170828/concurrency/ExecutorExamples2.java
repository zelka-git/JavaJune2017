package classwork.lesson170828.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExamples2 {

	public static void main(String[] args) throws InterruptedException {
//		ExecutorService service = Executors.newSingleThreadExecutor();
//		ExecutorService service = Executors.newFixedThreadPool(2);
		ExecutorService service = Executors.newCachedThreadPool();
		
		System.out.println("start");
		
		for(int i = 0; i < 5; i++) {
			int tmp = i;
			service.execute(()->{
				Utils.pause(3000);
				System.out.println("Hello, world " + tmp);
			});			
		}
		
		
		service.shutdown();
		
//		List taskLeft = (List) service.shutdownNow();
		
//		System.out.println(taskLeft);
		
		boolean succed = service.awaitTermination(1, TimeUnit.HOURS);
		
		System.out.println("finish" + succed);
		
	}
	
}
