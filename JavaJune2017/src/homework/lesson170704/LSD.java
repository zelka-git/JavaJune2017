package homework.lesson170704;

public class LSD {
	public static void sort(String[] a, int W) {
		//Сортировка a[] по старшим W символам
		int N = a.length;
		int R = 256;
		String[] aux = new String[N];
		
		for(int d = W-1; d >= 0; d--) {
//			Сортировака с помощью распределяющего подсчета по d-му символу
			int[] count = new int[R+1];	//Вычисление счетчиков повторений
			for(int i = 0; i < N; i++) {
				count[a[i].charAt(d) + 1]++;
			}
			for(int r = 0; r < R; r++) {	//Преобразование счетчиков в индексы
				count[r+1] += count[r];
			}
			for (int i = 0; i < N; i++) {	//Распределение
				aux[count[a[i].charAt(d)]++] = a[i];
			}
			for (int i = 0; i < N; i++) {
				a[i] = aux[i];
			}
		}
	}
}
