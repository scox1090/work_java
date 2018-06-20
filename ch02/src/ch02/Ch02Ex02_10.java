package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {
	public static void main(String[] args) {
		// Scanner 객체 생성(Syste.in은 키보드)
		Scanner scanner = new Scanner(System.in);

		// 두개의 정수를 문자열로 입력받기
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		// 두 개의 정수를 문자열로 입력받기
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);

		// num1과 num2를 이용하여 계산 및 출력

		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
	}
}