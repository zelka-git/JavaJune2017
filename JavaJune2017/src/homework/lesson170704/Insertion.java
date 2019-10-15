package homework.lesson170704;

public class Insertion {
	public static void sort(Comparable[] a) {
		//сортировка а[] по возрастанию
		int N = a.length;
		for (int i = 0; i < N; i++) {
			//вставка a[i] по возрастанию
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
				exch(a, j, j-1);
			}
		}
	}

	private static void exch(Comparable[] a, int j, int i) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
		
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public static void sort(String[] a, int lo, int hi, int d) {
		//Сортировака от a[lo] до a[hi], начиная с d-го символа
		for (int i = lo; i < hi; i++) {
			for (int j = i; j > lo && less(a[j], a[j-1], d); j--) {
				exch(a, j, j-1);
			}
		}
		
	}
	
	

	private static boolean less(String v, String w, int d) {
		return v.substring(d).compareTo(w.substring(d)) < 0;
	}	
	
	
}
