package classwork.lesson170724.nested;

public class Outer {
	int state;
	void change() {state++;}
}

class Helper{
	private Outer outer;
	public Helper() {
		this.outer = outer;
	}
	void process() {
		outer.state = 30;
		outer.change();
		outer.change();
		System.out.println(outer);
	}
}
