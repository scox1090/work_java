package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {
	public static void main(String[] args) {
		// Scnner ��ü ����(System.in�� Ű����)
		Scanner scanner = new Scanner(System.in);
		// ������ �Է¹����� �ȳ��ϴ� ���� ���
		System.out.print("heght = ");

		// ���� �ϳ� ���ڿ��� �Է¹ޱ�
		String input = scanner.nextLine();

		// �Է¹��� ������ ����(int)������ �����ϱ�
		int height = Integer.parseInt(input);

		System.out.print("Your height is " + height + "cm.");
	}
}