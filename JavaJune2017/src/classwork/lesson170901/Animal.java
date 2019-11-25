package classwork.lesson170901;

public class Animal {

	private final int id;
	private final String name;
	private final int age;
	
	public Animal(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof Animal)) {
			return false;
		}
		
		Animal other = (Animal) obj;
		if(this.id != id) {
			return false;
		}
		if(this.age != age) {
			return  false;
		}
		return true;
		
	}
	
	@Override
	public int hashCode() {
		int hashcode = 7;
		hashcode += 31 + this.id;
		hashcode += 31 + this.age;
		hashcode += 31 + this.name.hashCode();
		return hashcode;
	}
	

}
