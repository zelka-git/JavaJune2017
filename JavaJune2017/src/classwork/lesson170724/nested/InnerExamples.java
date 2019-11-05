package classwork.lesson170724.nested;

public class InnerExamples {
	int state = 0;
	public void change() {
		state++;
	}
	
	class Processor{
		public void process(){
			state = 20;
			change();
			change();
			System.out.println(InnerExamples.this);
		}
	}
	@Override
	public String toString() {
		return "current state = " + state;
	}
}
