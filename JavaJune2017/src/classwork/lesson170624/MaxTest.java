package classwork.lesson170624;

import classwork.mytestframework.Assert;

public class MaxTest {
	public static void main(String[] args) {
		System.out.println(Assert.assertEqual(MathUtils.max(10, 20),  20));
		System.out.println(Assert.assertEqual(MathUtils.max(10, 30),  30));
		System.out.println(Assert.assertEqual(MathUtils.max(20, 10),  20));
		System.out.println(Assert.assertEqual(MathUtils.max(30, 10),  30));

		System.out.println(Assert.assertEqual(MathUtils.max(Integer.MAX_VALUE, 10),  Integer.MAX_VALUE));
		System.out.println(Assert.assertEqual(MathUtils.max(Integer.MIN_VALUE, Integer.MAX_VALUE),  Integer.MAX_VALUE));

		System.out.println(Assert.assertNotEqual(MathUtils.max(30, 10),  10));
	
	}


}
