package ch02;

public class CastingEx5 {
	public static void main(String[] args) {
		float f = 1234; // �⺯ȯ�� ����. float f = (float)1234;�� ����
		int b = 1000; // ����. byte�� ����(-128~127)�� �Ѵ� ���� ����.
		char ch = (char) 1000; // ����� ����ȯ. ������ �߻����� �ʴ´�.
		int i = 3;
		double d = 1.0 + (double) i;

		System.out.println(ch);
		/*
		 * �ڵ� ����ȯ�� ��Ģ byte -> shor(char) -> int -> long -> float -> double
		 */

	}
}