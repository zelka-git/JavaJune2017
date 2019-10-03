package homework.lesson170624;

public class ModTest {
	public static void main(String[] args) {
		System.out.println(SimpleUnit.assertEqual(MathUtils.mod(5, 3), 2));
		System.out.println(SimpleUnit.assertEqual(MathUtils.mod(5, 2), 1));

		System.out.println(SimpleUnit.assertNotEqual(MathUtils.mod(5, 3), 3));
		System.out.println(SimpleUnit.assertNotEqual(MathUtils.mod(5, 2), 4));
	}
}
