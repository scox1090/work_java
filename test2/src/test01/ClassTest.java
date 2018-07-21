package test01;

public class ClassTest {

	int a; // 정해져있는 변수는 초기화를 안하면 null로 정해져있는 않은 변수는 초기화 안하면 0으로 초기화된다.

	ClassTest() {
		System.out.println("ct기본");
		System.out.println(a);
	}

	ClassTest(int a) {
		System.out.println("ct int 생성자");
	}

	ClassTest(String a) {
		System.out.println("ct String생성자");
	}

	void test() {
		System.out.println("전 테스트 함수입니다.");
	}
	
	void test(int a) {
		System.out.println("저는 테스트 인트 함수입니다.");
	}
	int test(String s) {
		return 0;
	}
	
	ClassTest test(boolean b) {
		return this;
	}
	
	String test(double b) {
		return "abc";
	}
	public static void main(String[] args) {	//void는 호출은 가능하나 변수에 사용은 불가능하다.
		ClassTest ct = new ClassTest();
		ct.test();
		ct.test(100);
		String str = ct.test(1.2);
	}
}

/*
 * 생성자 void(보내지 않는다.):자바에서는 데이터 타입으로 존재하지 않음 public static void main(String[]
 * args)의 메서드가 아닌 것
 */

/*
 * 오버로딩 1.매게변수(parameter)가 달라야 한다. 2.매게변수(parameter)의 개수가 달라야한다.
 * 3.메게변수(parameter)의 순서가 달라야한댜.
 */

/*
 * public     : 어떤 접근이든 가능하다.
 * protected  : 상속받은 클래스나 같은 패키지에서의 접근이 가능하다.
 * default	  : 기본값 (같은 패키지 내에서만 접근이 가능하다.)
 * private    : 클래스 내부에서만 상속이 가능하다.
 */
