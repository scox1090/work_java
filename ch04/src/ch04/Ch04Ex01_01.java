package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
//		숫자를 하나 입력 받는다.
		Scanner sc = new Scanner(System.in);//정수 하나 입력
		int num = sc.nextInt();
		System.out.println(num);
		
//		입력받은 숫자가 음수인가를 확인한다.
		if (num <= 0)
			System.out.println("minus");
	}
}