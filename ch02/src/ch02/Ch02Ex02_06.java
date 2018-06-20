package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {
	public static void main(String[] args) {
		// Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		// 실수 2개를 문자열로 입력받기
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		// 입력받은 실수 2개를 실수(double)형으로 변경하기
		double yd = Float.parseFloat(input1);
		double in = Float.parseFloat(input2);

		// num1과 num2 변수를 이용하여 계산 및 출력
		System.out.printf("%4.1fyd = %5.1fcm\n", yd, yd * 91.44);
		System.out.printf("%4.1fin = %5.1fcm\n", in, in * 2.54);
	}
}