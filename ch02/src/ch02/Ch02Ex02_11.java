package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
	public static void main(String[] args) {
		// Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);

		// �Ǽ� �� ���� ���ڿ��� �Է¹ޱ�

		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		// �Է¹��� �� �Ǽ��� �Ǽ�(double)������ ����
		double num1, num2;
		num1 = Float.parseFloat(input1);
		num2 = Float.parseFloat(input2);

		// printf()�� �̿��Ͽ� ���� ���
		System.out.printf("%10.2f %10.2f %10.2f", num1, num2, num1 + num2);
	}
}