package test02;

class Test{
//	System.out.println("abc");
}

public class FinalTest extends Test{
	public static final int NUM_TEST = 1;		//상수는 이름을 모두 대문자로 한다.
	
	public void test() {
		System.out.println("재정의");
	}
	
	public static void main(String[] args) {
		System.out.println(FinalTest.NUM_TEST);
	}
}

//메서드 앞에 final을 붙이면 오버로딩을 하지 못한다.