package ch03;

public class OperatorEx04 {
	public static void main(String[] args) {
		int i = -10; // i�� -10
		i = +i; // i�� -10 (+�� ���ϱ� +1 �� �Ͱ� ����)
		System.out.println(i); // -10 ���

		i = -10; // i�� -10
		i = -i; // i�� 10 (-�� ���ϱ� -1 �� �Ͱ� ����)
		System.out.println(i); // 10 ���
	}
}