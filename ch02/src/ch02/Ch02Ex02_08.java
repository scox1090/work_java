package ch02;

import java.util.Scanner;

public class Ch02Ex02_08 {
	public static void main(String[] args) {
		// Scanner 객체 생성(System.in은 키보드
		Scanner scanner = new Scanner(System.in);

		// Scanner를 이용하여 실수 2개와 한개의 문자를 문자열로 입력받기
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();

		// 입력받은 실수 2개와 문자를 각각 실수(double)형으로 변경(문자는 변경 필요 없음)
		float num1 = Float.parseFloat(input1);
		float num2 = Float.parseFloat(input2);

		// printf() 이용하여 실수 2개와 문자 출력
		System.out.printf("%.2f\n", num1);
		System.out.printf("%.2f\n", num2);
		System.out.print(input3);
	}
}