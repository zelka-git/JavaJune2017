package homework.lesson170816;

import java.util.Arrays;
import java.util.Random;

public class MSDint {
	private static int R = 256;
	private static final int M = 15;
	private static int[] aux;
	
	public static int bytes (int number, int runk) {
		if (runk > 3) {
			System.out.println("Runk must be in range [0, 3]");
			return -1;
		}
		int result = 0;
		int mask = 0x00000000;
		switch(runk) {
			case 0:
				mask = 0x000000FF;
				result = number & mask;
				break;
			case 1:
				mask = 0x0000FF00;
				result =(number & mask) >> 8;
				break;
			case 2:
				mask = 0x00FF0000;
				result =(number & mask) >> 16;
				break;
			case 3:
				mask = 0xFF000000;
				result =(number & mask ^ 0x80000000) >>> 24;
				break;
		}
		return result;
	}
	
	public static void sort(int[] a) {
		int N = a.length;
		aux = new int[N];
		sort(a, 0, N-1, 3);
	}
	
	private static void sort(int[] a, int lo, int  hi, int runk) {	
		if(hi <= lo + M) {
			insertionSort(a, lo, hi, runk);
			return; 
		}
		
		int count[] = new int[R+2]; //вычисление счетчика повторений
		for (int i = lo; i <= hi; i++) {
			count[bytes(a[i], runk) + 2]++;			
		}
		
		count[0] = 0;
		for (int i = 0; i < count.length - 1; i++) {//преобразование счетчиков в индексы
			count[i+1] += count[i];
		}
		
		for (int i = lo; i <= hi; i++) {//Распределение
			aux[count[bytes(a[i], runk) +1]++] = a[i];
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
			for (int j = i; j > lo && (a[j] < a[j-1]) ; j--) {
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
//			mass[i] = Math.abs(random.nextInt());
			mass[i] = (random.nextInt());
			copyMass[i] = mass[i];
//			System.out.println(random.nextInt());
		}
		for(int i = 0; i < mass.length; i++) {
			if(mass[i] != copyMass[i]) {
				System.out.println("i = " + i + "\t" + mass[i] + "\t" + copyMass[i]);
			}
		}
		
		

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
