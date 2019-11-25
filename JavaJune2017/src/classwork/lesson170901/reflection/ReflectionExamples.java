package classwork.lesson170901.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import classwork.lesson170828.concurrency.Utils;

public class ReflectionExamples {
	
	static {
		System.out.println("static init");
	}

	public static void main(String[] args) {
		
		System.out.println("start");
		
		Utils.pause(5000);
		
		System.out.println("reflection");
		
		Class<Sample> clazz = Sample.class;
		
		Constructor<?>[] constructors = clazz.getConstructors();
		
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}

		for (Method method :clazz.getMethods()) {
			System.out.println(method);
		}
		
		System.out.println("----------");
		for (Method method :clazz.getDeclaredMethods()) {
			System.out.println(method);
		}
		
		System.out.println(Sample.MAX);
		
	}
	
}

class Sample{
	static final int MAX = 10;
	static {
		System.out.println("static sample init");
	}
	
	
	void change() {
		
	}
	public void bigChange() {
		
	}
}
