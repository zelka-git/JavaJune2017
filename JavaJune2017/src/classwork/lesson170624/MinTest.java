package classwork.lesson170624;

public class MinTest {
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEqual(MathUtils.min(10, 20), 10));
		System.out.println(SimpleUnit.assertEqual(MathUtils.min(20, 10), 10));
		System.out.println(SimpleUnit.assertEqual(MathUtils.min(-10, 20), -10));
		System.out.println(SimpleUnit.assertEqual(MathUtils.min(-20, 10), -20));
		
		System.out.println(SimpleUnit.assertEqual(MathUtils.min(Integer.MIN_VALUE, 10), Integer.MIN_VALUE));
		System.out.println(SimpleUnit.assertEqual(MathUtils.min(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MIN_VALUE));

		System.out.println(SimpleUnit.assertNotEqual(MathUtils.min(20, 10), 20));
	}
}
