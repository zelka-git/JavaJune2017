package classwork.lesson170825.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
		
		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
		
//		traders.stream().map(t -> t.getName()).forEach(System.out::println);
		traders.stream().map(Trader::getName).forEach(System.out::println);
		
		List<String> traderNames = traders.stream().map(Trader::getName).collect(Collectors.toList());
		
		System.out.println(traderNames);
		
		
		
	}
	
}
