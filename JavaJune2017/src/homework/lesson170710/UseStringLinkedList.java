package homework.lesson170710;

public class UseStringLinkedList {
	public static void main(String[] args) {
		StringLinkedList list = new StringLinkedList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		System.out.println(list);

		System.out.println(list.remove(0));
		System.out.println(list);
		
		System.out.println(list.remove(1));
		System.out.println(list);

		System.out.println(list.remove(2));
		System.out.println(list);
		
		
	}
}
