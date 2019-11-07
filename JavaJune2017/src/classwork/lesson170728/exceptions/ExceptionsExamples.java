package classwork.lesson170728.exceptions;

public class ExceptionsExamples {

	public static void main(String[] args){
		System.out.println("start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("stop");
	}
	
}
