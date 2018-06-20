package ch03;

import java.util.Scanner;

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';

		System.out.printf("문자를 하나 입력하세요.>");

		// 문자열을 입력하고 엔터키를 입력하기 전까지 14번에서 멈춤
		String input = scanner.nextLine();

		// 입력받은 문자열에서 0번째에 해당하는 문자를 끄집어낸다.
		ch = input.charAt(0); 
		/*
		 * 첫번째를 나타내는 것이 0인 이유 : 프로그램이 주소를 이용하여 계산하기 때문에
		 * 첫번째 문자는 주소 자체를 나타내면 되므로 0인 것이다.
		 * ex) even이라는 문자를 저장할 때 1000부터 저장된 다고 할 때 
		 * 'e'1000 , 'v' 1001, 'e' 1002, 'n' 1002로 저장된다.
		 * 프로그램은 1000 + charAt()에서 괄호 안의 값 이렇게 계산하기 때문에
		 * 0번째 부터 시작
		 */

		// 끄집어 낸 문자가 '0'과 '9' 사이에 포함되는지 확인
		if ('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.  %n");
		}

		// 끄집어 낸 문자가 'a'와 'z' 사이 이거나 'A'와 'Z'사이 인지 확인
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다. %n");
		}

	}
}
