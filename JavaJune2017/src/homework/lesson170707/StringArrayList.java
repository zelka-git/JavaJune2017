package homework.lesson170707;

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
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		if (size > 0) {
			sb.append(elements[0]);
			for(int i = 1; i < size; i++) {
				sb.append(",").append(elements[i]);
			}
		}
		sb.append("]");
		return sb.toString();
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
	public boolean remove(String element) {
		int index = -1;
		for(int i = 0; i < size; i++) {
			if(elements[i] == element) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			return false;
		}
		System.arraycopy(elements, index + 1, elements, index, size - index - 1);
		size--;
		elements[size] = null;
		return true;
	}
	public String get(int i) {
		if (i < size && i >=0) {
			return elements[i];
		}
		return null;
	}
	public String set(int index, String element) {
		if(index < size && index >=0) {
			String oldValue = elements[index];
			elements[index] = element;
			return oldValue;
		}
		return null;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
}
