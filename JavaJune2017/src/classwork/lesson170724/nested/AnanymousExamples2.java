package classwork.lesson170724.nested;

public class AnanymousExamples2 {

	interface Operation{
		int apply(int a, int b);
	}
	
	static class Addition implements Operation{
		@Override
		public int apply(int a, int b) {
			return a + b;
		}
	}
	
	static class Multiplication implements Operation{
		@Override
		public int apply(int a, int b) {
			return a * b;
		}
	}
	
	public static void main(String[] args) {
		int result = process(new Addition(), 10 ,20);
		System.out.println(result);

		result = process(new Multiplication(), 10 ,20);
		System.out.println(result);
		
		result = process((a, b) -> a / b, 40, 10);

		result = process(new Operation() {
			@Override
			public int apply(int a, int b) {
				return a / b;
			}
			
		}, 40, 10);
		
		class Subtract implements Operation {
			@Override
			public int apply(int a, int b) {
				return a - b;
			}
			
		}
		result = process(new Subtract(), 40, 10);
	}

	private static int process(Operation op, int i, int j) {
		return op.apply(i , j);
	}
	
}
