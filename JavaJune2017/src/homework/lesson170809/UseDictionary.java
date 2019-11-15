package homework.lesson170809;

import homework.lesson170809.Dictionary.Pair;

public class UseDictionary {
	public static void main(String[] args) {
		Dictionary<String, String> d = new Dictionary<>();
		d.put("Pete", "New York");
		d.put("Jhon", "Boston");
		d.put("Вася", "Москва");
		d.put("Петя", "Москва");
		d.put("Боря", "Москва");
		d.put("Ася", "Москва");
		d.put("Жана", "Москва");
		d.put("Даша", "Москва");
		d.put("Толя", "Москва");
		d.put("Шура", "Москва");
		
		System.out.println(d.get("Ann"));
		System.out.println(d.get("Jhon"));
		System.out.println(d.get("Вася"));
		for (Pair pair : d) {
			System.out.println(pair.key + " " + pair.value);
		}
		System.out.println();
		d.resize();
		d.delete("Ася");
		for (Pair pair : d) {
			System.out.println(pair.key + " " + pair.value);
		}
		
		System.out.println();
		
		Dictionary<String, String> d1 = new Dictionary<>();
		Dictionary<String, String> d2 = new Dictionary<>(100);
		fill(d1, 1000);
		fill(d2, 1000);
		
		findElement(d1, "Jhon999");
		findElement(d2, "Jhon999");
		
		System.out.println();

		Dictionary<String, String> d3 = new Dictionary<>();
		Dictionary<String, String> d4 = new Dictionary<>(100);
		fill(d3, 10000);
		fill(d4, 10000);
		
		findElement(d3, "Jhon9999");
		findElement(d4, "Jhon9999");

		System.out.println();
		
		Dictionary<String, String> d5 = new Dictionary<>();
		Dictionary<String, String> d6 = new Dictionary<>(100);
		fill(d5, 100000);
		fill(d6, 100000);
		
		findElement(d5, "Jhon99999");
		findElement(d6, "Jhon99999");
		
	
	}

	private static void findElement(Dictionary<String, String> d, String element) {
		long start = System.currentTimeMillis();
		String el = d.get(element);
		long stop = System.currentTimeMillis();
		System.out.println("Time of found element " + el + " in dictionary width(" + d.getWidth()+ ") = " + (stop - start));
	}

	private static void fill(Dictionary<String, String> d, int amount) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < amount; i++) {
			d.put("Jhon" + i, "Boston" + i);
		}		
		long stop = System.currentTimeMillis();
		System.out.println("Time of fill " + amount + " Pair in dictionry width("+ d.getWidth() + ")  = " + (stop - start));
	}
}
