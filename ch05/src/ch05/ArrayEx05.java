package ch05;

public class ArrayEx05 {
	public static void main(String[] args) {
		int sum = 0; 				// ������ �����ϱ� ���� ����
		float avg = 0f; 			// ����� �����ϱ� ���� ����

		int[] score = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++)
			sum += score[i];
		avg = sum / (float) score.length;			 // ������� float�� ��� ���ؼ� ����ȯ

		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}
}
