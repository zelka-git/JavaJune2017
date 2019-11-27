package homework.lesson170823;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListToMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("one");
		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");
		
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map2 = new TreeMap<>();
		Map<String, Integer> map3 = new LinkedHashMap<>();
		Map<String, Integer> map4 = new HashMap<>();
		
		for (String item : list) {
			if(map.containsKey(item)) {
				Integer count = map.get(item);
				map.put(item, count+1);
			}else {
				map.put(item, 1);
			}
		}
		for (Map.Entry<String,	Integer> pair : map.entrySet()) {
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
		
		
		System.out.println("______________");
		for (String string : list) {
			map2.merge(string, 1, (key, value) -> {return value + 1;});
		}
		printMap(map2);
		
		
		System.out.println("______________");
		list.forEach(s -> {
			map3.merge(s,	1,  (key, value) -> {
				return value + 1;
				});
			});		
		printMap(map3);
		
		System.out.println("______________");
		list.forEach(s -> {
			Integer key = map4.putIfAbsent(s, 1);
			if(key != null) {
				map4.put(s, key+1);
			};
		});
		printMap(map4);
		
	}

	private static void printMap(Map<String, Integer> map) {
		map.forEach((k,v) -> {System.out.println(k+ " " + v);});
	}
	
}
