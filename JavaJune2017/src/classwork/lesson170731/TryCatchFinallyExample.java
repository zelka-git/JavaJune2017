package classwork.lesson170731;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("help.txt")) {
			int read = fis.read();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
