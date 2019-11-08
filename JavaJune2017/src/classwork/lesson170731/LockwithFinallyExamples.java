package classwork.lesson170731;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockwithFinallyExamples {

	static class Counter{
		
		Lock lock = new ReentrantLock();
		
		int count;
		
		public void inc(){
			lock.lock();
			try {
				internal();				
			} finally {
				lock.unlock();
			}
		}
		
		private void internal() {
			int register = count;
			register++;
			count = register / 0;
		}

		public int get() {
			lock.lock();
			try {
				return count;				
			} finally {
				lock.unlock();				
			}
		}
	}
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		Runnable task = () ->  {
			while (true) {
				counter.inc();
				System.out.println(counter.get());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread (task).start();

		new Thread (task).start();
	}
	
}
