package homework.lesson170704;

import java.util.Arrays;

public class ArraysExamples {
	public static void main(String[] args) {
		int[] a = {};
		int[] b;
		b = new int[] {};
		b = new int[0];
		b = new int[10];
		b = new int[] {0,0,0,0,0,0,0,0,0,0,0};
		System.out.println(a);
		String s[] = new String[3];
		System.out.println(Arrays.toString(s));
		
		print(s);
		
	}

	private static void println(String[] arraysOfString) {
		int index = 0;
		while (index < arraysOfString.length) {
			System.out.println(arraysOfString[index++]);
//			index++;
		}
	}
	
	private static void print(String[] arraysOfString) {
		int index = 0;
		System.out.print("[");
		while (index < arraysOfString.length) {
			System.out.print(arraysOfString[index++]);
			if(index != arraysOfString.length)
			 {
				System.out.print(", ");
//			index++;
			}
			}
		System.out.println("]");
	}
	
}
