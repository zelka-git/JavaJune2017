package classwork.lesson170706;

public class StringBuilderAndBuffer {
	public static void main(String[] args) {
		int[] a = new int[100_000];
		System.out.println(toString(new int[0]));
		long start = System.currentTimeMillis();
		String s = toString(a);
		long stop = System.currentTimeMillis();
		System.out.println(stop - start);
		
		start = System.currentTimeMillis();
		s = toString2(a);
		stop = System.currentTimeMillis();
		System.out.println(stop - start);
//		System.out.println(s);
	}

	private static String toString2(int[] a) {
		StringBuilder sb = new StringBuilder("[");
		
		if(a.length > 0) {
			sb.append(a[0]);
			for (int i = 1; i < a.length; i++) {
				sb.append(",").append(a[i]);
			}
		}
		sb.append("]");
		
		return sb.toString();
	}

	private static String toString(int[] a) {
		String r = "[";
		if(a.length > 0) {
			r += a[0];
			for (int i = 1; i < a.length; i++) {
				r += "," + a[i];
			}
		}
		r += "]";
		
		return r;
	}
}
