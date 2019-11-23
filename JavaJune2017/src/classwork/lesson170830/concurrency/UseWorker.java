package classwork.lesson170830.concurrency;

public class UseWorker {

	public static void main(String[] args) {
		Worker worker = new Worker();
		
		worker.execute(()-> {
			System.out.print("hello, ");
		});

		worker.execute(()-> {
			System.out.println("world!");
		});
		
	}
	
}
