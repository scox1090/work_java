package ch04;

import java.util.Scanner;

public class FlowEx06 {

	/*
	 * switch문
	 * 
	 * switch(조건) { // 경우의 수를 설정하여 해당하는 경우의 Case를 실행
	 * 		 Case □ : 실행할 값 
	 * 		break; //빠져나오기
	 * 		Case □ : 실행할 값
	 * 		 break; 
	 * 		º   º   º  
	 */

	public static void main(String[] args) {
		int month = 0;

		System.out.print("현재 월을 입력하세요. >");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		month = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 수자로 변환

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을 입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;

		default:
			System.out.println("유효한 값을 입력하지 않았습니다.");
		}
	}
}
