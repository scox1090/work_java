package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {
	public static void main(String[] args) {
		// Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);

		// 정수 하나와 실수 하나를 문자열로 입력받기
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		// 입력받은 값을 정수(int)형, 실수(double)형으로 변경하기
		int num1 = Integer.parseInt(input1);
		double num2 = Double.parseDouble(input2);

		System.out.printf("%.2f * %d  =  %.0f", num2, num1, (double) num1 * num2);
	}
}