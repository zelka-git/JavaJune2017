package homework.lesson170816;

import java.util.Random;

public class UseBytes {
	
	private static final int MAX = 500;

	public static void main(String[] args) {
//		Random r = new Random();
//		int a[] = new int[MAX];
//		for(int i = 0; i < MAX; i++) {
//			a[i] = r.nextInt(1_000_000); 
//			System.out.println(a[i] + "\t" + MSDint.bytes(a[i], 0));
//		}
		
		
		Random random = new Random();
		int N = 1_000_000; // count symbols of massiv
		int[] mass = new int[N];
		for (int i = 0; i < N; i++) {
			mass[i] = random.nextInt();
//			System.out.println(mass[i]);
		}

		for (int i = 0; i < N; i++) {
			if(mass[i] < 0) {				
				System.out.print(mass[i]+ " : " + Integer.toHexString(mass[i])+" : ");
				for(int j = 3; j >= 0; j--) {
					System.out.print(MSDint.bytes(mass[i], j) + " ");
				}
				System.out.println();
			}
		}


	}

}
