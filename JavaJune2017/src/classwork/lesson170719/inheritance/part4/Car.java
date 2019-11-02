package classwork.lesson170719.inheritance.part4;

public class Car extends Automobile {
	
	private static final int STANDART_SEATS_NUMBER = 4;

	Object[] seats;
	
	Car(){
		this(STANDART_SEATS_NUMBER);
	}
	
	public Car(int seatsNumber) {
		seats = new Object[seatsNumber];
	}
	
	private static final int STANDART_SPEED = 150;

	public int getSpeed() {
		return STANDART_SPEED;
	}
}
