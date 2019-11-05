package classwork.lesson170724.nested;

public class AnanymousExamples {

	static abstract class Operation{
		abstract int apply(int a, int b);
	}
	
	static class Addition extends Operation{

		@Override
		int apply(int a, int b) {
			return a + b;
		}
		
	}
	
	static class Multiplication extends Operation{

		@Override
		int apply(int a, int b) {
			return a * b;
		}
		
	}
	
	public static void main(String[] args) {
		int result = process(new Addition(), 10 ,20);
		System.out.println(result);

		result = process(new Multiplication(), 10 ,20);
		System.out.println(result);
		
		result = process(new Operation() {

			@Override
			int apply(int a, int b) {
				return a / b;
			}
			
		},40, 10);
	}

	private static int process(Operation op, int i, int j) {
		return op.apply(i , j);
	}
	
}
