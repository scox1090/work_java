package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {
	public static void main(String[] args) {
		// Scnner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		// 무엇을 입력받을지 안내하는 문구 출력
		System.out.print("heght = ");

		// 정수 하나 문자열로 입력받기
		String input = scanner.nextLine();

		// 입력받은 정술를 정수(int)형으로 변경하기
		int height = Integer.parseInt(input);

		System.out.print("Your height is " + height + "cm.");
	}
}