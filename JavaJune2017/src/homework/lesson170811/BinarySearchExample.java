package homework.lesson170811;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class BinarySearchExample {
	public static void main(String[] args) {
		List<A> linkedList = new LinkedList<>();
		List<A> arrayList = new ArrayList<>();
		Set<A> treeSet = new TreeSet<>();
		
		fill(linkedList);
		fill(arrayList);
		fill(treeSet);
		System.out.println();
		
		sort(linkedList);
		sort(arrayList);
		
		System.out.println();
		
		A key = new A();
		
		binarySearch(linkedList, key);
		binarySearch(arrayList,key);
		contains(treeSet, key);
	
		System.out.println();
		
		List<A> linkedList1 = new LinkedList<>();
		List<A> arrayList1 = new ArrayList<>();
		Set<A> treeSet1 = new TreeSet<>();
		
		
		fillSortBinarySearch(linkedList1, key);
		fillSortBinarySearch(arrayList1, key);
		
		fillContains(treeSet1, key);
		
	}

	private static void fillContains(Set<A> treeSet, A key) {
		long start = System.nanoTime();
		int length = 1_000_000;
		for (int i = 0; i < length; i++) {
			treeSet.add(new A());
		}
		treeSet.contains(key);
		long stop = System.nanoTime();
		String nameClass = treeSet.getClass().getSimpleName();
		System.out.println("all   " + nameClass  + "elemet " + key +":\t\t" + (stop - start));
	}

	private static void fillSortBinarySearch(List<A> list, A key) {
		long start = System.nanoTime();
		int length = 1_000_000;
		for (int i = 0; i < length; i++) {
			list.add(new A());
		}
		Collections.sort(list);
		int index = Collections.binarySearch(list, key);
		long stop = System.nanoTime();
		String nameClass = list.getClass().getSimpleName();
		System.out.println("all " + nameClass + "elemet " + key +"(" +index+"):\t" + (stop - start));
	}


	private static void contains(Set<A> treeSet, A key) {
		long start = System.nanoTime();
		treeSet.contains(key);
		long stop = System.nanoTime();
		String nameClass = treeSet.getClass().getSimpleName();
		System.out.println("contains   " + nameClass + "\t " + "elemet " + key +":\t" + (stop - start));
	}

	private static void binarySearch(List<A> list, A key) {
		
		long start = System.nanoTime();
		int index = Collections.binarySearch(list, key);
		long stop = System.nanoTime();
		String nameClass = list.getClass().getSimpleName();
		System.out.println("binarySearch " + nameClass + "\t " + "elemet " + key +"(" +index+"):\t" + (stop - start));
	}

	private static void sort(List<A> list) {
		long start = System.nanoTime();
		Collections.sort(list);
		long stop = System.nanoTime();
		String nameClass = list.getClass().getSimpleName();
		System.out.println("sort " + nameClass + "\t: " + (stop - start));
		
	}

	private static void fill(Collection<A> collection) {
		long start = System.nanoTime();
		int length = 1_000_000;
		for (int i = 0; i < length; i++) {
			collection.add(new A());
		}
		long stop = System.nanoTime();
		String nameClass = collection.getClass().getSimpleName();
//		System.out.println(nameClass);
		System.out.println("fill " + nameClass + "\t" + length + " elements: " + (stop - start));
		
		
	}
}


class A implements Comparable<A>{
	static Random r = new Random(0);
	int x = r.nextInt(1_000_000);
	
	@Override
	public String toString() {
		return Integer.toString(x);
	}

	@Override
	public int compareTo(A other) {
		return x - other.x;
	}
}