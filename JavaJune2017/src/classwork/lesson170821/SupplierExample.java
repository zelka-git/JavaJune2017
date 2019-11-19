package classwork.lesson170821;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {

	
	public static void main(String[] args) {
		Supplier<String> stringSupplier = ()->"hello";
		
		Supplier<LocalDate> dataSupplier = () -> LocalDate.now();
		Supplier<LocalDate> dataSupplier2 = LocalDate::now;
		
		Supplier<LocalDate> dateSupplier3 = new Supplier<LocalDate>() {

			@Override
			public LocalDate get() {
				return LocalDate.now();
			}
		};
		
		LocalDate localDate = dataSupplier.get();
		System.out.println(localDate);
		
		Supplier<ArrayList<String>> arrayListSupplier = () -> new ArrayList<>();
		Supplier<ArrayList<String>> arrayListSupplier2 = ArrayList::new;
		
		
	}
}
