package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	
	System.out.printf("%d / %d = %d...%d",num1,
			num2, num1 / num2, num1 % num2);
}
}
