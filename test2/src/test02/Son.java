package test02;

public class Son extends Father{
	Son(){
//		super(); 부모로가는 명령어가 숨어져 있다.
		System.out.println("난 아들 생성자!");
	}
	
	void test(int a) {
		System.out.println("난 아들 테스트 실행"+a);
	}
	
	void test() {
		super.test();
	}
}

/*
 *super:부모에 있는 생성자를 가져온다.
 *this:현재 코드에 있는 생성자를 가져온다.
 *test()등의 생성자는 오버라이딩 되는 것
 *test(int a)등의 생성자에 매게변수가 있는 것은 오버로딩이 되는 것 
 */