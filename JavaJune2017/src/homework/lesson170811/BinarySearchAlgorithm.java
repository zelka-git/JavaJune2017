package homework.lesson170811;

public class BinarySearchAlgorithm {
	public static void main(String[] args) {
		
		int[] a = new int[]{1, 6, 8, 32, 67, 120};
		System.out.println(binarySearch(a, 32));
		System.out.println(binarySearch(a, 33));
		System.out.println(binarySearch(a, 31));
		System.out.println(binarySearch(a, 0));
		System.out.println(binarySearch(a, 123));
	}
	
	private static int binarySearch(int[] a, int key) {
		int lo = 0;
		int hi = a.length - 1;
		int mid = 0;
		while(lo <= hi) {			
			mid = lo + (hi - lo) / 2;
			if(a[mid] > key) {
				hi = mid - 1;
			}else if(a[mid] < key) {
				lo = mid + 1;
			}else {
				return mid;
			}
		}
		if(a[mid] > key) {
			return - mid;
		}else {			
			return -(mid+1);
		}
	}
}
