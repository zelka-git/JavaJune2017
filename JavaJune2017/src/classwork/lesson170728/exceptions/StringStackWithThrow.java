package classwork.lesson170728.exceptions;

import java.util.Arrays;

public class StringStackWithThrow {
	
	public static class Overflow extends Exception{
		
		private int size;
		
		public Overflow(int size) {
			this.size = size;
		}
		
		public int getSize() {
			return size;
		}
		
	}
	
	private static final int DEFAULT_MAX_SIZE = 3;
	private String[] elements;
	private int size;

	public StringStackWithThrow(int maxSize) {
		elements = new String[maxSize];
		size = 0;
	}

	public StringStackWithThrow() {
		this(DEFAULT_MAX_SIZE);
	}

	public boolean push(String string) throws Exception {
		
		if (string == null ) {
			throw new IllegalArgumentException("null are not allowed");
		}
		
		if(size >= elements.length) {
			throw new Overflow(size);
		}
		try {
			this.elements[size++] = string;			
		} catch (ArrayIndexOutOfBoundsException aiob) {
			return false;
		}
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
