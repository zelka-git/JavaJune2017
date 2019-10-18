package homework.lesson170707;

public class UseStringArrayList {
	public static void main(String[] args) {
		StringArrayList list = new StringArrayList();
		list.add("one");
		
		System.out.println(list);
		
		list.add("two");
		list.add("three");
		System.out.println(list);
		list.add("four");
		list.add("five");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
//		String symbol = list.get(0);
		System.out.println(list.get(-2));
		
		list.set(2, "seven");
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.remove("seven"));
		System.out.println(list);
	}
}
