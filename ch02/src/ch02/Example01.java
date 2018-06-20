package ch02;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("두자리 정수를 입력해 주십시오.");
		//String input = scanner.nextLine();
		//int num = Integer.parseInt(input);			// 입력받은 문자열을 숫자로 변환
		int num = scanner.nextInt();						// 입력받은 문자열을 정수(int)로 받아 전달
		int num2 = scanner.nextInt();					// 입력받은 문자열을 정수(int)로 받아 전달
		
		System.out.printf("num=%d, num2=%d%n", num, num2);
		System.out.printf("10진수 : %d 8진수 : %o 16진수 : %x", num, num, num);
	}
}
