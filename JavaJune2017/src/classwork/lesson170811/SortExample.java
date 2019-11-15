package classwork.lesson170811;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] a = {10, 20, 0, 20, 12, -9, 100};
		
		int index = find(a, 8);
		System.out.println(index);
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static int find(int[] a, int e) {
		for (int j = 0; j < a.length; j++) {
			if(a[j] == e) {
				return j;
			}
		}
		return -1;
	}
}
