package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		// �Է¹ޱ� ���� scanner��ü ����, System.in�� Ű����
		Scanner scanner = new Scanner(System.in);

		// scanner�� ���� �Է¹ޱ� (3��)
		String strkor = scanner.nextLine();
		String strmat = scanner.nextLine();
		String stravg = scanner.nextLine();

		// ���ڿ��� ���� �������� ���������� ��ȯ
		int kor = Integer.parseInt(strkor);
		int mat = Integer.parseInt(strmat);
		int eng = Integer.parseInt(stravg);

		// �հ�� ��� ���ϱ�
		int sum = kor + mat + eng;
		int avg = sum / 3;

		// printf()�� �̿��Ͽ� ���
		System.out.printf("kor %d%n", kor);
		System.out.printf("mat %d%n", mat);
		System.out.printf("eng %d%n", eng);
		System.out.printf("sum %d%n", sum);
		System.out.printf("avg %d%n", avg);

	}
}