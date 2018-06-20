package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {
	public static void main(String[] args) {
		// 2.3번 응용

		// Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);

		// 정수 2개를 문자열로 입력받기
		String strN1 = scanner.nextLine();
		String strN2 = scanner.nextLine();
		String strN3 = scanner.nextLine();
		String strN4 = scanner.nextLine();

		// 입력받은 정수 2개를 정수형으로 변경
		int num1 = Integer.parseInt(strN1);
		int num2 = Integer.parseInt(strN2);
		int num3 = Integer.parseInt(strN3);
		int num4 = Integer.parseInt(strN4);

		// 정수형으로 변경한 두 변수 num1과 num2를 이용하여 계산

		int result1 = num1 - num2;
		int result2 = num3 - num4;

		System.out.println(num1 + "-" + num2 + "=" + result1);
		System.out.println(num3 + "-" + num4 + "=" + result2);

	}
}