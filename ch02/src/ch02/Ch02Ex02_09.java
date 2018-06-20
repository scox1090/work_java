package ch02;

import java.util.Scanner;

public class Ch02Ex02_09 {
	public static void main(String[] args) {
		// Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);

		// 실수(float)형 2개 실수(double)형
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();

		// 실수(float)형 2개와 실수(double)형 한개를 각각 float과 double형으로 변경
		float num1 = Float.parseFloat(input1);
		float num2 = Float.parseFloat(input2);
		double num3 = Float.parseFloat(input3);

		System.out.printf("%.3f\n", num1);
		System.out.printf("%.3f\n", num2);
		System.out.printf("%.3f\n", num3);
	}
}