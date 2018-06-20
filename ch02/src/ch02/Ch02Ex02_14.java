package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {
	public static void main(String[] args) {
		// Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);

		// 실수 하나를 문자열로 입력받기
		System.out.print("yard? ");
		String input1 = scanner.nextLine();

		// 입력받은 실수를 실수(double)형으로 변경하기
		double num1 = Double.parseDouble(input1);

		// 위 변수들을 이용하여 계산 및 출력
		System.out.printf("%.1fyard = %.1fcm", num1, num1 * 91.44);
	}
}