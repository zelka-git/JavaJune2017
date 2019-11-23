package classwork.lesson170830.concurrency;

import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {
	
	static final Runnable POISON_PILL = () -> {};
	
	BlokingQueue<Runnable> tasks = new BlokingQueue();

	public Worker(){
		new Thread(this::porocessTasks).start();
	}
	
	@Override
	public void execute(Runnable command) {
		tasks.put(command);
	}
	
	private void porocessTasks() {
		while(true) {
			Runnable task = tasks.take();
			if(task == POISON_PILL) {return;}
			Optional.ofNullable(task).ifPresent(r -> r.run());
		}
	}

	public void shutdown() {
		tasks.put(POISON_PILL);
	}
	
}
