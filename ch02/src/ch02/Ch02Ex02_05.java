package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	public static void main(String[] args) {
		// Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);

		// 하나의 정수와 하나의 실수를 문자열로 입력받기
		String N1 = scanner.nextLine();
		String N2 = scanner.nextLine();

		// 입력받은 두 문자열을 각각 정수와 실수로 변경하기
		float gr = Float.parseFloat(N2);
		int w = Integer.parseInt(N1);

		// num1, num2 변수를 이용하여 계산 및 출력
		System.out.printf("%d * %.4f = %.4f", w, gr, w * gr);
	}
}
