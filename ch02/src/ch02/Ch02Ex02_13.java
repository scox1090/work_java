package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {
	public static void main(String[] args) {
		// Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);

		// 정수 세 개를 문자열로 입력받기
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();

		// 입력받은 정수를 정수(int)형으로 변경하기
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);

		// 입력받은 정수를 정수(int)형으로 변경하기
		System.out.printf("sum = %d\n", num1 + num2 + num3);
		System.out.printf("avg = %d", (num1 + num2 + num3) / 3);
	}
}