package classwork.lesson170809;

import classwork.lesson170809.Dictionary.Pair;

public class UseDictionary {
	public static void main(String[] args) {
		Dictionary d = new Dictionary();
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
	}
}
