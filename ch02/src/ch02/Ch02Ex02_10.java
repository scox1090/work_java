package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {
	public static void main(String[] args) {
		// Scanner ��ü ����(Syste.in�� Ű����)
		Scanner scanner = new Scanner(System.in);

		// �ΰ��� ������ ���ڿ��� �Է¹ޱ�
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		// �� ���� ������ ���ڿ��� �Է¹ޱ�
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);

		// num1�� num2�� �̿��Ͽ� ��� �� ���

		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
	}
}