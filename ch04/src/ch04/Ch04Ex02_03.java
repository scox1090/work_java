package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
//		0이 입력될 때까지 계속 실행됨
		for (;;) {
			if (num != 0) {
//				정수를 입력받는다.
				System.out.print("정수를 입력하세요. (0:종료)>");
				num = sc.nextInt();
//				정수가 양수인지 음수인지 출력
				if (num > 0) {
					System.out.println("positive integer");
				} else if(num < 0 ){
					System.out.println("negative number");
				}
			} else {
				break;
			}
		}
	}
}