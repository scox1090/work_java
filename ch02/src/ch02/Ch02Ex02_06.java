package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {
	public static void main(String[] args) {
		// Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);
		// �Ǽ� 2���� ���ڿ��� �Է¹ޱ�
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		// �Է¹��� �Ǽ� 2���� �Ǽ�(double)������ �����ϱ�
		double yd = Float.parseFloat(input1);
		double in = Float.parseFloat(input2);

		// num1�� num2 ������ �̿��Ͽ� ��� �� ���
		System.out.printf("%4.1fyd = %5.1fcm\n", yd, yd * 91.44);
		System.out.printf("%4.1fin = %5.1fcm\n", in, in * 2.54);
	}
}