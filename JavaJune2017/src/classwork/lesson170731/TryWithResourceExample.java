package classwork.lesson170731;

public class TryWithResourceExample {

	static class Resource implements AutoCloseable{
		@Override
		public void close() {}

		public void use() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static void main(String[] args) {
//		Resource r = new Resource();
//		try {
//			r.use();
//		} finally {
//			r.close();
//		}
//		
		try(Resource r2 = new Resource()){
			r2.use();
		}
	}
	
}
