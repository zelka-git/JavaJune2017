package classwork.lesson170707;

import java.util.Arrays;

public class StringArrayList {
	private static final int DEFAULT_SIZE = 2;
	String[] elements = new String[DEFAULT_SIZE];
	//[a,b,c,d,e,f]
	// 0 1 2 3 4 5
	
	private int size = 0;

	public void add(String string) {
		if(size == elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		elements[size++] = string;
	}
	@Override
	public String toString() {
		
		return Arrays.toString(elements);
	}
	
	//[a,b,c,d,e,f,_]
	// 0 1 2 3 4 5
	//[a,b,d,e,f,_,_]
	// 0 1 2 3 4 5
	
	public void remove(int i) {
		// TODO Auto-generated method stub
		if ( i >= size || i < 0) {
			return;
		}
		System.arraycopy(elements, i+1, elements, i, size - i - 1);
		size--;
		elements[size] = null;
	}
}
