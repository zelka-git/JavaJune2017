package classwork.lesson170719.inheritance.part4;

public class Mercedes extends Car{
	public Mercedes(int seats) {
		super(seats);
	}

	@Override
	public int getSpeed() {
		return super.getSpeed() + 50;
	}
}
