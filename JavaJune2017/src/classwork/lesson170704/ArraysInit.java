package classwork.lesson170704;

import java.util.Arrays;

public class ArraysInit {
	public static void main(String[] args) {
		int[][] m = {
				{0,0,0},
				{0,0,0},
		};
		
		int[][] m2 = new int[2][3];
		
		int[][] m3;
		m3 = new int[2][];
		System.out.println(Arrays.toString(m3));
		m3[0] = new int[3];
		m3[1] = new int[3];
		
		int[][][] cube;
		System.out.println(Arrays.toString(squareUp(3)));
	}
	
	
	public static int[] squareUp(int n) {
		  int[] nums= new int[n*n];
		  for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		      if(i >= j) {
				nums[(i + 1) * n - j - 1] = 1 + j ;
		      } 
		    }
		  }
		  return nums;
		}
}
