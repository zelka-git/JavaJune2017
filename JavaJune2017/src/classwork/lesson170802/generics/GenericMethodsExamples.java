package classwork.lesson170802.generics;

public class GenericMethodsExamples {

	public static void main(String[] args) {
		String modified = XX.modify("one");
	}
	
}

class XX<T>{
	
	public static <M> M modify(M t) {
		return t;
	}

	public <L> void m(L t) {
		
	}
}
