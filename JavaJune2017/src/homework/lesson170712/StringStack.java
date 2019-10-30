package homework.lesson170712;

import java.util.Arrays;

public class StringStack {
	
	private static final int DEFAULT_MAX_SIZE = 3;
	private String[] elements;
	private int size;

	public StringStack(int maxSize) {
		elements = new String[maxSize];
		size = 0;
	}

	public StringStack() {
		this(DEFAULT_MAX_SIZE);
	}

	public boolean push(String string) {
		//FIXME check for Stack Overflow
		if(size >= elements.length) {//guard condition
			return false;
		}
		elements[size++] = string;
		return true;
	}

	public String pop() {
		if(size <= 0) {		//guard condition
			return null;	//stack under
		}
		String result = elements[--size];
		elements[size] = null;
		return result;
	}

	public String tos() {
		return size <= 0 ? null : elements[size-1];
	}

	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
		// TODO Auto-generated method stub
//		return super.toString();
	}

}
