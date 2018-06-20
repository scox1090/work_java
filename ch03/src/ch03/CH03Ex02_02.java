package ch03;

import java.util.Scanner;

public class CH03Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int width = scanner.nextInt();
		int length = scanner.nextInt();
		
		width += 5;
		length *= 2;
		System.out.printf("width = %d%n", width);
		System.out.printf("length = %d%n", length);
		System.out.printf("area = %d%n"	, width * length);
	}
}