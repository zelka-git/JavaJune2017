package classwork.lesson170707;

import classwork.mytestframework.Assert;

public class StringMethodsPractice {
	public static void main(String[] args) {
		String s = "   Hello!   ";
		String s2 = "Hello!";
		String s3 = "Hello!  ";
		String s4 = "   Hello!";
		String s5 = " He  l l o ! ";
		String s6 = "";
		String result = trim(s4);
		System.out.println(result);
		
		System.out.println(Assert.assertEqual(trim(s6), ""));
		System.out.println(Assert.assertEqual(trim(s2), s2));
		System.out.println(Assert.assertEqual(trim(s4), s2));
	}

	private static String trim(String s) {
		if(s == null || s.length() == 0) {
			return s;
		}
		if(s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length()-1) {// no leading and trailing spaces
			return s;
		}
		return s;
	}
}
