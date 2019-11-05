package homework.lesson170724;

public class Rat implements Pet {

	Brain brain = new Hungry(this);
	
	@Override
	public void feed() {
		brain.feed();
	}

	@Override
	public void play() {
		brain.play();
	}

	public void bite() {
		System.out.println("bites");
	}
	public void eat() {
		System.out.println("eats");
	}

	public void jump() {
		System.out.println("jumps");
	}

	public void run() {
		System.out.println("run");
	}

}

class Hungry implements Brain{

	private Rat rat;
	public Hungry(Rat rat) {
		this.rat = rat;
	}
	
	@Override
	public void feed() {
		rat.eat();
		rat.brain = new Fed(rat);
	}

	@Override
	public void play() {
		rat.bite();
	}
}

class Fed implements Brain{
	private Rat rat;
	public Fed(Rat rat) {
		this.rat = rat;
	}
	@Override
	public void feed() {
		rat.run();
	}

	@Override
	public void play() {
		rat.jump();
		rat.brain = new Hungry(rat);
	}
	
}