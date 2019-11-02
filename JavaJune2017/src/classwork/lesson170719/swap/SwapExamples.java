package classwork.lesson170719.swap;

import java.util.Arrays;

public class SwapExamples {
	public static void main(String[] args) {
		int x = 100;
		int y = 50;
		int tmp = x;
		x = y;
		y = tmp;
		
		x = x + y;
		//x  = 100 + 50
		
		y = x - y; // y == 100
		x = x - y; // x = 50
		
		swap(x, y);
		
		int[] a = {100 ,50};
		swap(a);
		System.out.println(Arrays.toString(a));
	}

	private static void swap(int[] a) {
		int tmp = a[0];
		a[0] = a[1];
		a[1] = tmp;
		
	}

	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
			
	}
}
