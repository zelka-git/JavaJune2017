package homework.lesson170704;

import java.util.Arrays;
import java.util.Random;

public class MSDint {
	private static int R = 19;
	private static final int M = 15;
	private static int[] aux;
	
	private static int digit (int number, int runk) {
		if (runk > 9) {
			System.out.println("Runk must be in range [0, 9]");
			return -1;
		}
		int result = (int)(number/(Math.pow(10, runk)));
		if (runk != 9) {
			result %= 10;
		}		
		return result;
	}
	
	public static void sort(int[] a) {
		int N = a.length;
		aux = new int[N];
		sort(a, 0, N-1, 9);
	}
	
	private static void sort(int[] a, int lo, int  hi, int runk) {	
		if(hi <= lo + M) {
			insertionSort(a, lo, hi, runk);
			return; 
		}
		
		int count[] = new int[R+2]; //вычисление счетчика повторений
		for (int i = lo; i <= hi; i++) {
			count[digit(a[i], runk) + 11]++;			
		}
		
		count[0] = 0;
		for (int i = 0; i < count.length - 1; i++) {//преобразование счетчиков в индексы
			count[i+1] += count[i];
		}
		
		for (int i = lo; i <= hi; i++) {//Распределение
			aux[count[digit(a[i], runk) +10]++] = a[i];
		}

		for (int i = lo; i <= hi; i++) {// Копирование назад
			a[i] = aux[i - lo];
		}
//		Рекурсивная сортировка для каждого значения символа
		for (int r = 0; r < R ; r++) {
//			int left = count[r];
//			int right = count[r+1];
//			if(right - left > 1)
//			 {
//				sort(a, lo + count[r], lo + count[r+1] - 1, runk - 1);
//			}
			sort(a, lo + count[r], lo + count[r+1] - 1, runk - 1);
		}
		
		
	}
	
	private static void insertionSort(int[] a, int lo, int hi, int runk) {
		//Сортировка от a[lo] до a[hi], начиная с runk разряда
		for (int i = lo; i <= hi; i++) {
			for (int j = i; j > lo && (a[j] % Math.pow(10, runk+1)) < (a[j-1] % Math.pow(10, runk+1)); j--) {
				int x = a[j];
				a[j] = a[j-1];
				a[j-1] = x;
			}
		}	
	}
	

	public static void main(String[] args) {

		Random random = new Random();
		int N = 1_000_000; // count symbols of massiv
		int[] mass = new int[N];
		int[] copyMass = new int[N];
		for (int i = 0; i < N; i++) {
			mass[i] = random.nextInt();
			copyMass[i] = mass[i];
//			System.out.println(random.nextInt());
		}
		for(int i = 0; i < mass.length; i++) {
			if(mass[i] != copyMass[i]) {
				System.out.println("i = " + i + "\t" + mass[i] + "\t" + copyMass[i]);
			}
		}
		
		
		
//		int[] test = {2147483647, 1147483647, -2147483647, -1147483647,23,87,34,123};
//		sort(test);
//		for (int i = 0; i < test.length; i++) {
//			System.out.println(test[i]);
//		}
		 long startTime;
	     long stopTime;
	     long elapsedTime;
	     
	     startTime = System.currentTimeMillis();
	     sort(mass);
	     stopTime = System.currentTimeMillis();
	     System.out.println("time sort = " + (stopTime - startTime));
	     
	     startTime = System.currentTimeMillis();
	     Arrays.sort(copyMass);
	     stopTime = System.currentTimeMillis();
	     System.out.println("time Arrays.sort = " + (stopTime - startTime));
	     
//	     for (int i = 0; i < mass.length; i += 70000) {
//			System.out.println(mass[i] + "\t" + copyMass[i]);
//		}
	     int count = 0;
	     for (int i = 0; i < mass.length; i ++) {
	    	 if (mass[i] != copyMass[i]) {	    		 
	    		 System.err.println(mass[i] + "\t" + copyMass[i] + "\ti = " + i);
	    		 count++;
	    	 }
	     }
	     System.out.println("count errors = " + count);
	     
	     
	}
}
