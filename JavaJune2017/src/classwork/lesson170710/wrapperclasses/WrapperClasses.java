package classwork.lesson170710.wrapperclasses;

import java.util.Hashtable;

public class WrapperClasses {
	public static void main(String[] args) {
		Hashtable table = new Hashtable();
		
		int[] a = {0,10,20,30};
		
		System.out.println(a[1]);
		
		a[2] = 50;
		
		table.put("Иванов", "123-45-67");//table[""] = "";
		table.put("Петров", "123-45-68");
		table.put("Сидоров", "123-45-69");
		
		System.out.println(table);
		table.put("Иванов", "123-45-00");
		
		System.out.println(table);
		
		table.put(new Integer(1), "one");
		table.put(new Integer(1000000), "million");

		table.put(2, "one");
		table.put(1000000, "million");
		
	}
}
