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
		pr(this.name + "���� ��ϴ�.");
	}

	@Override
	public void run() {
		pr(this.name + "���� �ݴϴ�.");
	}

	@Override
	public void walk() {
		pr(this.age + "�� " + this.name + "���� �Ƚ��ϴ�.");
	}

	@Override
	public void wakeUp() {
		
	}

	@Override
	public void breakUp() {
		
	}

}
