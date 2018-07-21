package test01;

public class ClassTest {

	int a; // �������ִ� ������ �ʱ�ȭ�� ���ϸ� null�� �������ִ� ���� ������ �ʱ�ȭ ���ϸ� 0���� �ʱ�ȭ�ȴ�.

	ClassTest() {
		System.out.println("ct�⺻");
		System.out.println(a);
	}

	ClassTest(int a) {
		System.out.println("ct int ������");
	}

	ClassTest(String a) {
		System.out.println("ct String������");
	}

	void test() {
		System.out.println("�� �׽�Ʈ �Լ��Դϴ�.");
	}
	
	void test(int a) {
		System.out.println("���� �׽�Ʈ ��Ʈ �Լ��Դϴ�.");
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
	public static void main(String[] args) {	//void�� ȣ���� �����ϳ� ������ ����� �Ұ����ϴ�.
		ClassTest ct = new ClassTest();
		ct.test();
		ct.test(100);
		String str = ct.test(1.2);
	}
}

/*
 * ������ void(������ �ʴ´�.):�ڹٿ����� ������ Ÿ������ �������� ���� public static void main(String[]
 * args)�� �޼��尡 �ƴ� ��
 */

/*
 * �����ε� 1.�ŰԺ���(parameter)�� �޶�� �Ѵ�. 2.�ŰԺ���(parameter)�� ������ �޶���Ѵ�.
 * 3.�ްԺ���(parameter)�� ������ �޶���Ѵ�.
 */

/*
 * public     : � �����̵� �����ϴ�.
 * protected  : ��ӹ��� Ŭ������ ���� ��Ű�������� ������ �����ϴ�.
 * default	  : �⺻�� (���� ��Ű�� �������� ������ �����ϴ�.)
 * private    : Ŭ���� ���ο����� ����� �����ϴ�.
 */
