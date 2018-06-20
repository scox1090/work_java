package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

//		조건을 만족할 때까지 계속 코드 실행
		for(;;) {
//			정수를 입력받음
			num = sc.nextInt();
			if(num == -1) {
				break;
				
//				입력받은 숫자가 3의 배수이면 3으로 나눈 몫을 출력
			} else if(num%3==0) {
				System.out.println(num/3);
			}
		}
	
	}
}