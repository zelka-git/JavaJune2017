package classwork.lesson170830.concurrency;

import classwork.lesson170828.concurrency.Utils;
import classwork.lesson170830.concurrency.RaceConditionExample2.Modifier;

public class ThreadStopExample {

	public static void main(String[] args) {
		System.out.println("start");
		
		Model model = new Model();
		
		Modifier task = new Modifier(model);
		
		Thread t = new Thread(task);
		
		t.start();
		Utils.pause(500);
		
		t.stop();
		
		model.check();
		System.out.println("finish " + model);
	}
	
}
