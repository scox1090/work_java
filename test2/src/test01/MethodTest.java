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
	
	// ������ Ÿ���� String
	// �Լ�����  test()
	//3���� ������ �Լ������� �����
	//ȣ�����ֽø� �˴ϴ�.
	
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
