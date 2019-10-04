package classwork.lesson170624;

import classwork.mytestframework.Assert;

public class MinTest {
	public static void main(String[] args) {
		System.out.println(Assert.assertEqual(MathUtils.min(10, 20), 10));
		System.out.println(Assert.assertEqual(MathUtils.min(20, 10), 10));
		System.out.println(Assert.assertEqual(MathUtils.min(-10, 20), -10));
		System.out.println(Assert.assertEqual(MathUtils.min(-20, 10), -20));
		
		System.out.println(Assert.assertEqual(MathUtils.min(Integer.MIN_VALUE, 10), Integer.MIN_VALUE));
		System.out.println(Assert.assertEqual(MathUtils.min(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MIN_VALUE));

		System.out.println(Assert.assertNotEqual(MathUtils.min(20, 10), 20));
	}
}
