package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {
	public static void main(String[] args) {
		// Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);

		// ���� �ϳ��� �Ǽ� �ϳ��� ���ڿ��� �Է¹ޱ�
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		// �Է¹��� ���� ����(int)��, �Ǽ�(double)������ �����ϱ�
		int num1 = Integer.parseInt(input1);
		double num2 = Double.parseDouble(input2);

		System.out.printf("%.2f * %d  =  %.0f", num2, num1, (double) num1 * num2);
	}
}