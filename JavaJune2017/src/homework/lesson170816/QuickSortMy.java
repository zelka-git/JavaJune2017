package homework.lesson170816;

import java.util.Arrays;

public class QuickSortMy {

	public static void main(String[] args) {
		int[] a = {12, 9, 4 ,98, 34, 54, 9, 2};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	private static void sort(int[] a, int lo, int hi) {
		System.out.println(Arrays.toString(a));
		if(lo >= hi) {return;}
		int i = lo;
		int j = hi + 1;
		while(true) {
			while(a[++i] < a[lo]) {
				if(i == hi) {
					break;
				}
			}
			while(a[--j] > a[lo]) {
				if (j == lo) {
					break;
				}
			}
			if(i >= j) {
				break;
			}
			swap(a, i, j);
		}
		swap(a,lo,j);
		sort(a,lo, j-1);
		sort(a,j+1,hi);
	}

	private static void swap(int[] a, int i, int j) {
		int x = a[i];
		a[i] = a[j];
		a[j] = x;
	}
	
}
