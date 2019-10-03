package homework.lesson170624;

public class IsFibonacciTest {
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacc(8), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacc(34), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacc(377), true));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacc(610), true));

		System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacc(9), false));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacc(35), false));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacc(373), false));
		System.out.println(SimpleUnit.assertEqual(MathUtils.isFibonacc(617), false));

		System.out.println(SimpleUnit.assertNotEqual(MathUtils.isFibonacc(373), true));
		System.out.println(SimpleUnit.assertNotEqual(MathUtils.isFibonacc(610), false));
	}
}
