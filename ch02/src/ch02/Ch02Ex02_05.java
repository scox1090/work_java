package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	public static void main(String[] args) {
		// Scanner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);

		// �ϳ��� ������ �ϳ��� �Ǽ��� ���ڿ��� �Է¹ޱ�
		String N1 = scanner.nextLine();
		String N2 = scanner.nextLine();

		// �Է¹��� �� ���ڿ��� ���� ������ �Ǽ��� �����ϱ�
		float gr = Float.parseFloat(N2);
		int w = Integer.parseInt(N1);

		// num1, num2 ������ �̿��Ͽ� ��� �� ���
		System.out.printf("%d * %.4f = %.4f", w, gr, w * gr);
	}
}
