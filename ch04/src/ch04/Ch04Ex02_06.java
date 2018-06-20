package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while (true) { // 특정조건을 만족할 때까지 번호를 입력받음
			System.out.println("1.Korea");
			System.out.println("2.USA");
			System.out.println("3.Japan");
			System.out.println("4.China");
			System.out.print("number?");
			int num = sc.nextInt();

			// 특정 조건을 만족할 경우 참, 거짓을 저장하는 flag변수

			if (num == 1)
				System.out.println("Seoul");
			else if (num == 2)
				System.out.println("Washington");
			else if (num == 3)
				System.out.println("Tokyo");
			else if (num == 4)
				System.out.println("Beijing");
			else
				System.out.println("none");
			flag = true;
			
			if (flag == true)
				break;
		}

		

		/*
		 * swich(num){ case 1: system.println("Seoul"); break; case 2:
		 * system.println("Washington"); break; case 3: system.println("Tokyo"); break;
		 * case 4: system.println("Beijing"); break; default: system.println("nonel");
		 * break;
		 */
	}
}
