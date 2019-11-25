package classwork.lesson170901;

public enum Singleton {

	INSTANSE;
	
	int state;
	
	private Singleton() {
		
	}
	
	public void change() {
		state++;
	}
	
	public int getState() {
		return state;
	}
	
}
