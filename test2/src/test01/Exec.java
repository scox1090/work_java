package test01;

public class Exec {
	public static void main(String[] args) {
		Calc c = new Calc();
//		System.out.println(c.add(1, 2));		//private  ��� �Ұ���

		System.out.println(c.minus(1, 2));		//public   ��� ����
		System.out.println(c.multiple(1, 2));	//default  ��� ����

	}
}

/*
 * public
 * private(�ش� Ŭ���� ���ο����� ��밡��)
 * default
 * protected
 */