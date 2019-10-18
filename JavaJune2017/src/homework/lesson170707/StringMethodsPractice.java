package homework.lesson170707;

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

		System.out.println(Assert.assertEqual(trim(s), s2));
		System.out.println(Assert.assertEqual(trim(s3), s2));
		System.out.println(Assert.assertEqual(trim(s5), "He  l l o !"));
		
		System.out.println(s.replace("ll", "u"));
		System.out.println(s.replace("Hello!", "Hi, there!"));
		
		String newString = replace(s2, "ll", "pp");
		System.out.println("replace results: ");
		System.out.println(Assert.assertEqual(replace(s6, "", ""), ""));
		System.out.println(Assert.assertEqual(replace(s, "", ""), s));

		System.out.println(Assert.assertEqual(replace(s2, "ll", "pp"), "Heppo!"));
		System.out.println(Assert.assertEqual(replace(s2, "H", "He"), "Heello!"));
		System.out.println(Assert.assertEqual(replace(s2, "lo!", ""), "Hel"));
		System.out.println(Assert.assertEqual(replace(s2, "lo!", "ion!"), "Helion!"));
		System.out.println(Assert.assertEqual(replace(s2, "Hello!", ""), ""));
		System.out.println(Assert.assertEqual(replace(s2, "Hello!", "Hi, there!"), "Hi, there!"));

		
		System.out.println(Assert.assertEqual(replace(s2, "uu", "Hi, there!"), "Hello!"));

		System.out.println(Assert.assertEqual(replace(s2, 'o', 'y'), "Helly!"));
		
	}

	private static String replace(String string, char originChar, char expectChar) {
		if(string == null || string.length() == 0 || originChar == expectChar) {
			return string;
		}
		int indexOriginChar = string.indexOf(originChar);
		char[] str = string.toCharArray();
		str[indexOriginChar] = expectChar;
		return new String(str);
	}

	private static String replace(String string, String originPiece, String expectPiece) {
		
		int stringLen = string.length();
		int expectPieceLen = expectPiece.length();
		int originPieceLen = originPiece.length();
		if( string == null || stringLen == 0 || originPiece == null || originPieceLen > stringLen) {
			return string;
		}
		int indexOriginPiece = string.indexOf(originPiece);
		if(indexOriginPiece == -1) {
			return string;
		}
		int newLength = stringLen - originPieceLen + expectPieceLen;
		StringBuilder sb = new StringBuilder(newLength);
		sb.append(string, 0, indexOriginPiece).append(expectPiece).append(string, indexOriginPiece + originPieceLen, stringLen);
		return sb.toString();
	}

	private static String trim(String s) {
		int len = s.length();
		if(s == null || len == 0) {
			return s;
		}
		if(s.indexOf(' ') != 0 && s.lastIndexOf(' ') != len-1) {// no leading and trailing spaces
			return s;
		}
		int startIndex = 0;
		int stopIndex = len;
		for (int i = 0; i < len && s.charAt(i) == ' '; i++) {
			startIndex++;
		}
		for(int i = len - 1; i >= 0 && s.charAt(i) == ' '; i-- ) {
			stopIndex--;
		}
		return s.substring(startIndex, stopIndex);
	}
}
