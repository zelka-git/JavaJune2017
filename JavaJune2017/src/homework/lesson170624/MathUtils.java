package homework.lesson170624;

public class MathUtils {

	public static int sign(int i) {
		return i > 0 ? 1 : i < 0 ? -1 : 0;
	}

	public static int mod(int i, int j) {
		return i - j * (i / j);
	}

	public static boolean isPrime(int i) {
		for(int j = 2; j <= Math.sqrt(i); j++)
		{
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isFibonacc(int i) {
		int num0 = 0;
		int num1 = 1;
		if (i == 0) {
			return true;
		}
		while (num1 <= i) {
			if (i == num1) {
				return true;
			}
			int x = num0;
			num0 = num1;
			num1 = num0 + x;
		}
		return false;
	}

}
