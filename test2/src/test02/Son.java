package test02;

public class Son extends Father{
	Son(){
//		super(); �θ�ΰ��� ��ɾ ������ �ִ�.
		System.out.println("�� �Ƶ� ������!");
	}
	
	void test(int a) {
		System.out.println("�� �Ƶ� �׽�Ʈ ����"+a);
	}
	
	void test() {
		super.test();
	}
}

/*
 *super:�θ� �ִ� �����ڸ� �����´�.
 *this:���� �ڵ忡 �ִ� �����ڸ� �����´�.
 *test()���� �����ڴ� �������̵� �Ǵ� ��
 *test(int a)���� �����ڿ� �ŰԺ����� �ִ� ���� �����ε��� �Ǵ� �� 
 */