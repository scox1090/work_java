package ch02;

import java.util.Scanner;

public class Ch02Ex02_09 {
	public static void main(String[] args) {
		// Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);

		// �Ǽ�(float)�� 2�� �Ǽ�(double)��
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();

		// �Ǽ�(float)�� 2���� �Ǽ�(double)�� �Ѱ��� ���� float�� double������ ����
		float num1 = Float.parseFloat(input1);
		float num2 = Float.parseFloat(input2);
		double num3 = Float.parseFloat(input3);

		System.out.printf("%.3f\n", num1);
		System.out.printf("%.3f\n", num2);
		System.out.printf("%.3f\n", num3);
	}
}