package ch04;

import java.util.Scanner;

public class FlowEx04 {
	public static void main(String[] args) {
		int score = 0; // 점수를 저장하기 위한 변수
		char grade = ' '; // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

		System.out.println("점수를 입력하세요. >");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 수자로 변환한다.

		if (score >= 90) { // score가 90점 보다 크거다 같은면 A학점
			grade = 'A';
		} else if (score >= 80) { // score가 90점 보다 크거다 같은면 B학점
			grade = 'B';
		} else if (score >= 70) { // score가 90점 보다 크거다 같은면 C학점
			grade = 'C';
		} else { // score가 90점 보다 크거다 같은면 D학점
			grade = 'D';
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
	}
}
