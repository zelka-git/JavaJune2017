package classwork.lesson170821;

import java.util.function.Function;

public class MethodPreferencesExamples {

	public static void main(String[] args) {
		Function<String, Integer> stirnLength = s -> s.length();
		Function<String, Integer> stirnLength2 = String::length;
		
		Runnable r = () -> Thread.currentThread().getName();
		
		Runnable r2 = Thread.currentThread()::getName;
		
	}
	
}
