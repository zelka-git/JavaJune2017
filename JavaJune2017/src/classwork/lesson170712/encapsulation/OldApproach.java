package classwork.lesson170712.encapsulation;

public class OldApproach {
	
	static class Stack{
		String[] elements;
		int size;
	}
	
	public static boolean push(Stack stack, String value) {
		if(stack.size >= stack.elements.length) {
			return false;
		}
		stack.elements[stack.size++] = value;
		return true;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		push(stack, "one");
	}
}
