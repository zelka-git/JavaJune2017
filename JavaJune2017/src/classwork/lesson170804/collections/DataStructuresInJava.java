package classwork.lesson170804.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class DataStructuresInJava {

	public static void main(String[] args) {
		int x = 0;
		String s = "hello";
		int a[] = new int[10];
		
		Object[] objs = new Object[0];
		
		Stack<String> stack = new Stack<>();
		stack.push("one");
		
		List<Number> list = Arrays.asList(1, 1.3, 0b0001);
		List<Number> linkedList = new LinkedList() {
			{
				add(1);
				add(1.3);
				add(0b0001);
			}
		};
		
		Queue<String> queue = new ArrayDeque<>();
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		
		
		
	}
}
