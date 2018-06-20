package ch04;

import java.util.Scanner;

public class FlowEx05 {
public static void main(String[] args) {
	int score = 0 ;
	char grade = ' ', opt = '0';
	
	System.out.print("점수를 입력해주세요. >");

	Scanner scanner = new Scanner(System.in);
	score = scanner.nextInt();
	
	System.out.printf("당신의 점수는 %d입니다. %n", score);
	
	if (score >=90) {						//score가 90점 보다 크거나 같으면 A학점
		grade = 'A';
		if (score >=98) {
			opt = '+';
		} else if (score < 94) {
			opt = '-';
		}
	}else if (score >=80) {				//score가 80점 보다 크거나 같으면 B학점
		grade = 'B';
		if (score >=88) {
			opt = '+';
		} else if (score < 84) {
			opt = '-';
		}
	} else {										//나머지는 c학점입니다.
		grade = 'C';
	}


	System.out.printf("당신의 학점은 %c%c입니다. %n" , grade , opt);
}
}
