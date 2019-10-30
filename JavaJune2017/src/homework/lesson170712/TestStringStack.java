package homework.lesson170712;

import classwork.mytestframework.Assert;

public class TestStringStack {
	public static void main(String[] args) {
		StringStack stack = new StringStack();
		
		System.out.println(Assert.assertEqual(stack.tos(), null));
		System.out.println(Assert.assertEqual(stack.size(), 0));
		System.out.println(Assert.assertEqual(stack.toString(), "[]"));
		
		System.out.println();
		
		System.out.println(Assert.assertEqual(stack.push("one"), true));
		System.out.println(Assert.assertEqual(stack.push("two"), true));
		System.out.println(Assert.assertEqual(stack.push("three"), true));
		System.out.println(Assert.assertNotEqual(stack.push("four"), true));

		System.out.println(Assert.assertEqual(stack.tos(), "three"));
		System.out.println(Assert.assertEqual(stack.size(), 3));
		System.out.println(Assert.assertEqual(stack.toString(), "[one, two, three]"));
		System.out.println(Assert.assertNotEqual(stack.toString(), "[one, two, three, four]"));

		System.out.println();
		
		System.out.println(Assert.assertEqual(stack.pop(), "three"));
		System.out.println(Assert.assertEqual(stack.pop(), "two"));
		System.out.println(Assert.assertEqual(stack.pop(), "one"));
		System.out.println(Assert.assertEqual(stack.pop(), null));
		System.out.println(Assert.assertNotEqual(stack.pop(), "one"));
		
		System.out.println();
		
		System.out.println(Assert.assertEqual(stack.tos(), null));
		System.out.println(Assert.assertEqual(stack.size(), 0));
		System.out.println(Assert.assertEqual(stack.toString(), "[]"));
		
	}
}
