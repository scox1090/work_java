package test02;

public class Exec2 {

	public static void printObject(Action a) {
		a.sleep();
		a.run();
		a.walk();

	}

	public static void main(String[] args) {
		Action dog = new Dog("�۹���", 3);
		printObject(dog);
		
	}
}
