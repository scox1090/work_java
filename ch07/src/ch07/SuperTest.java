package ch07;

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent{
	int x = 10;
}

class Child extends Parent{
	// 기본 생성자
	Child(){
		System.out.println("Child 기본생성자 호출!");
	}
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);

	}
}
