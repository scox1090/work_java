package ch03;

public class OperatorEx11 {
	public static void main(String[] args) {
		// å 102�� ǥ 3-8 ����
		char a = 'a'; 					// �ƽ�Ű �ڵ� �� 97
		char d = 'd'; 					// �ƽ�Ű �ڵ� �� 100
		char zero = '0'; 			// �ƽ�Ű �ڵ� �� 48
		char two = '2'; 				// �ƽ�Ű �ڵ� �� 50

		// char���� ��Ģ���� ��, �ƽ�Ű �ڵ� ������ �����Ѵ�.
		System.out.printf("\'%c\' - \'%c\' = %d%n", d, a, d - a);					 // 'd' - 'a' = 3
		System.out.printf("\'%c\' -\'%c\' = %d%n", two, zero, two - zero);
		System.out.printf("\'%c\' = %d%n", a, (int) a);
		System.out.printf("\'%c\' = %d%n", d, (int) d);
		System.out.printf("\'%c\' = %d%n", zero, (int) zero);
		System.out.printf("\'%c\' = %d%n", two, (int) two);
	}
}