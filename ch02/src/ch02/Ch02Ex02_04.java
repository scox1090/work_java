package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {
	public static void main(String[] args) {
		// 2.3�� ����

		// Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);

		// ���� 2���� ���ڿ��� �Է¹ޱ�
		String strN1 = scanner.nextLine();
		String strN2 = scanner.nextLine();
		String strN3 = scanner.nextLine();
		String strN4 = scanner.nextLine();

		// �Է¹��� ���� 2���� ���������� ����
		int num1 = Integer.parseInt(strN1);
		int num2 = Integer.parseInt(strN2);
		int num3 = Integer.parseInt(strN3);
		int num4 = Integer.parseInt(strN4);

		// ���������� ������ �� ���� num1�� num2�� �̿��Ͽ� ���

		int result1 = num1 - num2;
		int result2 = num3 - num4;

		System.out.println(num1 + "-" + num2 + "=" + result1);
		System.out.println(num3 + "-" + num4 + "=" + result2);

	}
}