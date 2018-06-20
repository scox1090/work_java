package ch04;

import java.util.Scanner;

public class FlowEx02 {
	public static void main(String[] args) {
		int input; // 마킹이 안되는 이유 : 지역변수에 값을 주지 않아 초기화가 안되서 인식을 하지 못한다.

		System.out.print("숫자를 하나 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);

		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}

		if (input != 0) {
			System.out.println("입력하신 숫자는 0아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		}
	}
}
