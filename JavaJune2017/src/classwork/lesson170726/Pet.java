package classwork.lesson170726;

public class Pet implements Clenable {
	@Override
	public void clean() {
		System.out.println("wash with care");
	}

	@Override
	public void combine() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void takeApart() {
		throw new UnsupportedOperationException();
	}
}