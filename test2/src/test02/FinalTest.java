package test02;

class Test{
//	System.out.println("abc");
}

public class FinalTest extends Test{
	public static final int NUM_TEST = 1;		//����� �̸��� ��� �빮�ڷ� �Ѵ�.
	
	public void test() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		System.out.println(FinalTest.NUM_TEST);
	}
}

//�޼��� �տ� final�� ���̸� �����ε��� ���� ���Ѵ�.