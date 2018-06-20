package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
		// 년도 입력

		if (num1 % 400 == 0 || (num1 % 4 == 0 && num1 % 100 != 0))
			System.out.println("leap year");
		else
			System.out.println("common year");
	}
}