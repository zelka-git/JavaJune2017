package classwork.lesson170821;

public class MyFunctionalInreface {

	
	public static boolean checkSumIsZero(int x, int y, int z) {
		return x + y + z == 0;
	}
	public static boolean checkProductIsZero(int x, int y, int z) {
		return x * y * z == 0;
	}
	
	public static void main(String[] args) {
//		MyFunctionalInreface::checkSumIsZero;
		
		TriIntToBoolean t = (x, y, z) -> checkSumIsZero(x,y,z);
		TriIntToBoolean t2 = MyFunctionalInreface::checkSumIsZero;
		TriIntToBoolean t3 = MyFunctionalInreface::checkSumIsZero;
	}
}

@FunctionalInterface
interface TriIntToBoolean{
	boolean test(int x, int y, int z);
}