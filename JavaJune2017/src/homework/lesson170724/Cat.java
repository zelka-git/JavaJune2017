package homework.lesson170724;

public class Cat implements Pet {

	Brain brain = new Hungry();
	
	private class Hungry implements Brain{
		@Override
		public void feed() {
			mew();
			fawn();
			eat();
			mew();
			fawn();	
			brain = new Fed();
		}
		@Override
		public void play() {
			fizz();
			scratch();
			fizz();
		}
	}
	
	private class Fed implements Brain{

		@Override
		public void feed() {
			mew();
			fawn();
		}
		@Override
		public void play() {
			mew();	
			playWithClew();
			brain = new Hungry();
		}
		
	}
	
	@Override
	public void feed() {
		brain.feed();		
	}
	@Override
	public void play() {
		brain.play();
	}
	public void playWithClew() {
		System.out.println("play with a clew");
	}
	public void scratch() {
		System.out.println("scratchs");
	}
	public void fizz() {
		System.out.println("fizzs");
	}
	public void eat() {
		System.out.println("eats");
	}
	public void fawn() {
		System.out.println("fawns");
	}
	public void mew() {
		System.out.println("mew");
	}

	
}
