package classwork.lesson170624;

import classwork.mytestframework.Assert;

public class Asserts{
	public static void main(String[] args) {
		
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(3), "Fizz"));
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(6), "Fizz"));
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(333), "Fizz"));
		System.out.println(Assert.assertNotEqual(FizzBuzz.fizzBuzz(5), "Fizz"));
		
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(5), "Buzz"));
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(10), "Buzz"));
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(100), "Buzz"));
		System.out.println(Assert.assertNotEqual(FizzBuzz.fizzBuzz(1), "Buzz"));
		
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(300), "FizzBuzz"));
		System.out.println(Assert.assertNotEqual(FizzBuzz.fizzBuzz(11), "FizzBuzz"));

		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(1), "1"));
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(7), "7"));
		System.out.println(Assert.assertEqual(FizzBuzz.fizzBuzz(17), "17"));
		System.out.println(Assert.assertNotEqual(FizzBuzz.fizzBuzz(3), "3"));
		System.out.println(Assert.assertNotEqual(FizzBuzz.fizzBuzz(5), "5"));
		System.out.println(Assert.assertNotEqual(FizzBuzz.fizzBuzz(15), "15"));
	}
}
