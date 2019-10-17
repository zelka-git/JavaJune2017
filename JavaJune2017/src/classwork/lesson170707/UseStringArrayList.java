package classwork.lesson170707;

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
	}
}
