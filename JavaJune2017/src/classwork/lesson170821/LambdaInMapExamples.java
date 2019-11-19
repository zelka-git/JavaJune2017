package classwork.lesson170821;

import java.util.Map;
import java.util.TreeMap;

public class LambdaInMapExamples {

	public static void main(String[] args) {
		Map<String, String> staff = new TreeMap<>();
		staff.put("John", "Boston");
		staff.put("Mary", "New Yourk");
		staff.put("Pete","Boston");
		staff.put("Ann","Mockov");
		staff.put("Jane","Boston");
		staff.put("Harry","Hogwartz");
		
//		BinaryOperator<String> bop = (s1, s2) -> s2.toUpperCase();
//		
//		staff.replaceAll(bop);

		staff.replaceAll((s1, s2) -> s2.toUpperCase());
		System.out.println(staff);
		
		staff.computeIfAbsent("Kate", p -> "Paris");
	}
	
}
