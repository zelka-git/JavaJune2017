package classwork.lesson170714.inheritance.part2;

public class Linkage {
	static class Processor{
		int process(int[] a) {
			int sum = 0;
			for (int i : a) {
				sum += i;
			}
			return sum;
		}
	}
	
	static class AnotherProcessor extends Processor{
		@Override
		int process(int[] a) {
			// TODO Auto-generated method stub
			return super.process(a);
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = {0,1,2,3};
		int result = process(a);
	}

	private static int process(int[] a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
}
