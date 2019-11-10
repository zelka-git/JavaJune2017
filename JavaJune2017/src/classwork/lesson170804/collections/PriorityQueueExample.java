package classwork.lesson170804.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeMap;

public class PriorityQueueExample {
	private static final int MAX = 1_000_000;

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(20);
		pq.add(0);
		pq.add(5);
		pq.add(-3);
		pq.add(40);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		Random r = new Random();
		for (int i = 0; i < MAX; i++) {
			pq.add(r.nextInt(1_000_000_000));
			if(pq.size() > 10) {
				pq.poll();
			}
		}
		
		System.out.println(pq);
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		fill(wordCount);
		
		Map<String, Integer> wordCount2 = new LinkedHashMap<>();
		Map<String, Integer> wordCount3 = new TreeMap<>();
	}
	
	private static void fill(Map<String, Integer> wordCount) {
		List<String> words = Arrays.asList("one","two","tree","one","two");
		for (String word : words) {
			Integer count = wordCount.get(word);
			wordCount.put(word, count == null ? 1 : ++count);
		}
		
		System.out.println(wordCount);
	}
}
