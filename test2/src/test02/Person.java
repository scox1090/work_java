package test02;

public class Person implements Action {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void pr(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
	}

	@Override
	public void sleep() {
		pr(this.name + "¥‘¿Ã ¿‚¥œ¥Ÿ.");
	}

	@Override
	public void run() {
		pr(this.name + "¥‘¿Ã ∂›¥œ¥Ÿ.");
	}

	@Override
	public void walk() {
		pr(this.age + "ªÏ " + this.name + "¥‘¿Ã ∞»Ω¿¥œ¥Ÿ.");
	}

	@Override
	public void wakeUp() {
		
	}

	@Override
	public void breakUp() {
		
	}

}
