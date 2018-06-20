package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);

		num1 += 100;
		num2 = num2 % 10;

		System.out.print(num1);
		System.out.printf(" %d", num2);
	}
}
