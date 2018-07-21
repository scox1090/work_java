package test02;

public class Dog implements Action {
	
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void printObject(Object o) {
		System.out.println(o);
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		printObject(this.age + "살 강아지 " + this.name + "가 잡니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printObject(this.age + "살 강아지 " + this.name + "가 뜁니다.");

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		printObject(this.age + "살 강아지 " + this.name + "가 걷습니다.");

	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breakUp() {
		// TODO Auto-generated method stub

	}

}
