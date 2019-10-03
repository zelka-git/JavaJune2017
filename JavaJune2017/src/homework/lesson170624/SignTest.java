package homework.lesson170624;

public class SignTest {
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEqual(MathUtils.sign(10), 1));
		System.out.println(SimpleUnit.assertEqual(MathUtils.sign(-10), -1));
		System.out.println(SimpleUnit.assertEqual(MathUtils.sign(0), 0));

		System.out.println(SimpleUnit.assertNotEqual(MathUtils.sign(10), -1));
		System.out.println(SimpleUnit.assertNotEqual(MathUtils.sign(-10), 1));
		System.out.println(SimpleUnit.assertNotEqual(MathUtils.sign(0), -1));

		System.out.println(SimpleUnit.assertNotEqual(MathUtils.sign(10), 0));
		System.out.println(SimpleUnit.assertNotEqual(MathUtils.sign(-10), 0));
		System.out.println(SimpleUnit.assertNotEqual(MathUtils.sign(0), 1));
	}

}
