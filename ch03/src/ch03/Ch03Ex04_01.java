package ch03;

public class Ch03Ex04_01 {
	public static void main(String[] args) {
		// ���α׷� ���� �߿� 1�� ��ġ�� a���� �ñ��� ���
		// ��� 1: print �޼ҵ带 �̿��� ����غ���.
		// ��� 2: ����� ������ ����Ѵ�.

		int a = 5;
		a += 10;
		a = a - 1;// 5 + 10 - 1 = 14
		debugTest(a);
		System.out.printf("%d%n", a);
	}

	private static void debugTest(int b) {
		System.out.println(b + 10);
	}
}