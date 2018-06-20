package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
	public static void main(String[] args) {
		// Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);

		// 실수 두 개를 문자열로 입력받기

		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		// 입력받은 두 실수를 실수(double)형으로 변경
		double num1, num2;
		num1 = Float.parseFloat(input1);
		num2 = Float.parseFloat(input2);

		// printf()를 이용하여 계산및 출력
		System.out.printf("%10.2f %10.2f %10.2f", num1, num2, num1 + num2);
	}
}