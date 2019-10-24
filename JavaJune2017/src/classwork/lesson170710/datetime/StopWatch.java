package classwork.lesson170710.datetime;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
	 public static void main(String[] args) throws InterruptedException {
		Instant start = Instant.now();
		
		Thread.sleep(1000);
		
		Instant stop = Instant.now();
		
		Duration elapsed = Duration.between(start, stop);
		
		System.out.println(elapsed.getSeconds());
		System.out.println(elapsed.getNano());
		
		System.out.println(elapsed.toMillis());
		System.out.println(elapsed.toNanos());
		
		long timing = System.nanoTime() - System.nanoTime();
		System.out.println(timing);
	}
}
