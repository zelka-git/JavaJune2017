package classwork.lesson170811;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorExample {

	public static void main(String[] args) {
		List<B> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new B());
		}
		System.out.println(list);
		Collections.sort(list, new ComparatorB());
		System.out.println(list);
		Collections.sort(list, new ComparatorB().reversed());
		System.out.println(list);
	}
}

class B{
	static Random r = new Random();
	int x = r.nextInt(100);
	
	@Override
	public String toString() {
		return Integer.toString(x);
	}

}
class ComparatorB implements Comparator<B> {
	
	@Override
	public int compare(B o1, B o2) {
		
		return o1.x - o2.x;
	}
	
}