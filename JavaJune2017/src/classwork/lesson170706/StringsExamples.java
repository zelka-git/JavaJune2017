package classwork.lesson170706;

public class StringsExamples {
	public static void main(String[] args) {
		String s = "hello";
		String message = s.concat(", world");
		
		System.out.println(message);
		
		String newMessage = s + ", world!";
		System.out.println(newMessage);
	}
}
