package test01;

public class MethodTest {
	String str = "abc";
	
	String test() {
		return "a";
	}
	String test(int a) {
		return "b";
	}
	String test(double a) {
		return "c";
	}
	
	// 데이터 타입은 String
	// 함수명은  test()
	//3개의 동일한 함수명으로 선언과
	//호출해주시면 됩니다.
	
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();		
		System.out.println(mt1==mt2);
		System.out.println(mt1.str==mt2.str);
		MethodTest test = new MethodTest();
		System.out.println(test.test());
		System.out.println(test.test(1));
		System.out.println(test.test(1.2f));
		
	}
}
