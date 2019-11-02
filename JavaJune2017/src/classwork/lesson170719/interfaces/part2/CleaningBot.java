package classwork.lesson170719.interfaces.part2;

import java.util.Arrays;
import java.util.List;

public class CleaningBot {
	 public static void main(String[] args) {
		List<Furniture> furniture = 
				Arrays.asList(new Table(), new Chair());
		
		List<Instrument> instruments = 
				Arrays.asList(new Violin(), new Dram());
	}
}
