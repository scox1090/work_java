package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {
	public static void main(String[] args) {
		// Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);

		// �Ǽ� �ϳ��� ���ڿ��� �Է¹ޱ�
		System.out.print("yard? ");
		String input1 = scanner.nextLine();

		// �Է¹��� �Ǽ��� �Ǽ�(double)������ �����ϱ�
		double num1 = Double.parseDouble(input1);

		// �� �������� �̿��Ͽ� ��� �� ���
		System.out.printf("%.1fyard = %.1fcm", num1, num1 * 91.44);
	}
}