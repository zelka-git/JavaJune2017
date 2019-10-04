package homework.lesson170627;

public class Transform {
	public static String toBinaryString(int i) {
		String result = "";

		while (i > 0)
		{
			if(i % 2 == 0) {
				result = 0 + result;
			}else{
				result = 1 + result;
			}
			i = i >> 1;
		}
		
		return result;
	}
	public static String toOctalString(int i) {
		String result = "";
		
		while (i > 0)
		{
			if(i % 8 == 0) {
				result = 0 + result;
			}else{
				result = (i % 8) + result;
			}
			i = i >> 3;
		}
		
		return result;
	}
	public static String toHexString(int i) {
		String result = "";
		
		while (i > 0)
		{
			if(i % 16 == 0) {
				result = 0 + result;
			}else{
				int x = i % 16;
				if (x < 10) {
					result = x + result;					
				}else {
					switch(x) {
						case 10:
							result = 'A' + result;
							break;
						case 11:
							result = 'B' + result;
							break;
						case 12:
							result = 'C' + result;
							break;
						case 13:
							result = 'D' + result;
							break;
						case 14:
							result = 'E' + result;
							break;
						case 15:
							result = 'F' + result;
							break;
							
					}
					
				}
			}
			i = i >> 4;
		}
		
		return result;
	}
	
	public static String toString(int num, int base) {
		String result = "";
		while(true) {
			int rem = num % base;
			num = num / base;
			if (rem < 10) {					
				result = rem + result;
			}else {
				switch(rem) {
					case 10:
						result = 'A' + result;
						break;
					case 11:
						result = 'B' + result;
						break;
					case 12:
						result = 'C' + result;
						break;
					case 13:
						result = 'D' + result;
						break;
					case 14:
						result = 'E' + result;
						break;
					case 15:
						result = 'F' + result;
						break;
						
				}
			}
			if(num < base) {
				result = num +result;
				break;
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		System.out.println(Transform.toBinaryString(0));
		System.out.println(Transform.toBinaryString(1));
		System.out.println(Transform.toBinaryString(2));
		System.out.println(Transform.toBinaryString(3));
		System.out.println(Transform.toBinaryString(4));
		System.out.println(Transform.toBinaryString(5));
		System.out.println(Transform.toBinaryString(6));
		System.out.println(Transform.toBinaryString(7));
		System.out.println(Transform.toBinaryString(8));
		System.out.println(Transform.toBinaryString(9));
		System.out.println(Transform.toBinaryString(10));
		System.out.println(Transform.toString(10, 2));
		System.out.println("Octal");
		System.out.println(Transform.toOctalString(1));
		System.out.println(Transform.toOctalString(2));
		System.out.println(Transform.toOctalString(3));
		System.out.println(Transform.toOctalString(4));
		System.out.println(Transform.toOctalString(5));
		System.out.println(Transform.toOctalString(6));
		System.out.println(Transform.toOctalString(7));
		System.out.println(Transform.toOctalString(8));
		System.out.println(Transform.toOctalString(9));
		System.out.println(Transform.toOctalString(10));
		System.out.println(Transform.toOctalString(11));
		System.out.println(Transform.toOctalString(12));
		System.out.println(Transform.toOctalString(13));
		System.out.println(Transform.toOctalString(14));
		System.out.println(Transform.toOctalString(15));
		System.out.println(Transform.toOctalString(16));
		System.out.println(Transform.toOctalString(17));
		System.out.println(Transform.toOctalString(18));
		System.out.println(Transform.toString(18, 8));
		System.out.println("HEx");
		System.out.println(Transform.toHexString(1));
		System.out.println(Transform.toHexString(2));
		System.out.println(Transform.toHexString(3));
		System.out.println(Transform.toHexString(4));
		System.out.println(Transform.toHexString(5));
		System.out.println(Transform.toHexString(6));
		System.out.println(Transform.toHexString(7));
		System.out.println(Transform.toHexString(8));
		System.out.println(Transform.toHexString(9));
		System.out.println(Transform.toHexString(10));
		System.out.println(Transform.toHexString(11));
		System.out.println(Transform.toHexString(12));
		System.out.println(Transform.toHexString(13));
		System.out.println(Transform.toHexString(14));
		System.out.println(Transform.toHexString(15));
		System.out.println(Transform.toHexString(16));
		System.out.println(Transform.toHexString(17));
		System.out.println(Transform.toHexString(18));
		System.out.println(Transform.toHexString(19));
		System.out.println(Transform.toHexString(20));
		System.out.println(Transform.toHexString(21));
		System.out.println(Transform.toHexString(22));
		System.out.println(Transform.toHexString(23));
		System.out.println(Transform.toHexString(24));
		System.out.println(Transform.toHexString(25));
		System.out.println(Transform.toHexString(26));
		System.out.println(Transform.toHexString(27));
		System.out.println(Transform.toHexString(28));
		System.out.println(Transform.toHexString(29));
		System.out.println(Transform.toHexString(30));
		System.out.println(Transform.toHexString(31));
		System.out.println(Transform.toHexString(32));
		System.out.println(Transform.toHexString(33));
		System.out.println(Transform.toHexString(34));
		System.out.println(Transform.toHexString(35));
		System.out.println(Transform.toHexString(36));
		System.out.println(Transform.toHexString(37));
		System.out.println(Transform.toHexString(38));
		System.out.println(Transform.toHexString(39));
		System.out.println(Transform.toHexString(40));
		System.out.println(Transform.toHexString(41));
		System.out.println(Transform.toHexString(42));
		System.out.println(Transform.toHexString(43));
		System.out.println(Transform.toHexString(44));
		System.out.println(Transform.toHexString(45));
		System.out.println(Transform.toString(45, 16));
		
	}
}
