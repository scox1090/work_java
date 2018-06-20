package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.print(num1 / num2 + " ");
		System.out.printf("%.2f",(float)num1/num2);
	}
}
