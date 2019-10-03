package homework.lesson170624;

public class IsPrimeTest {
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(2), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(3), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(5), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(7), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(23), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(23), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(11), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(199), true));
		System.out.println();
		
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(4), false));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(900), false));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isPrime(30), false));
		
		System.out.println(SimpleUnit.assertNotEqual(MathUtils.isPrime(4), true));
		System.out.println(SimpleUnit.assertNotEqual(MathUtils.isPrime(12), true));
	}
}
