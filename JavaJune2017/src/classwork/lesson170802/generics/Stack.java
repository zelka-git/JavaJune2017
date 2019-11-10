package classwork.lesson170802.generics;

import java.util.Arrays;

public class Stack<E> {
	
	private static final int DEFAULT_MAX_SIZE = 3;
	private E[] elements;
	private int size;

	public Stack(int maxSize) {
		elements = (E[])new Object[maxSize];
		size = 0;
	}

	public Stack() {
		this(DEFAULT_MAX_SIZE);
	}

	public boolean push(E element) {
		//FIXME check for Stack Overflow
		if(size >= elements.length) {//guard condition
			return false;
		}
		elements[size++] = element;
		return true;
	}

	public E pop() {
		if(size <= 0) {		//guard condition
			return null;	//stack under
		}
		E result = elements[--size];
		elements[size] = null;
		return result;
	}

	public E tos() {
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
