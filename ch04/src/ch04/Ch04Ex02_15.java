package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 행과 열 입력
		/*
		 * int x = Integer.parseInt(input[0]);
		 * 
		 * for (int i = 1; i < x; i++) {
		 *  	for (int j = 1; j <= i; j++) {
		 * 			System.out.print("*"); 
		 * 		} 
		 * System.out.println(); 
		 * } int j = 0; 
		 * for (int i = x; i>= 1; i--) {
		 * 		 for (j = i; j >= 1; j--) {
		 * 		System.out.print("*"); 
		 *  	}
		 * System.out.println(); 
		 * }
		 */

		int i = 1;
		boolean isDesc = false;
		while (i != 0) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i == num) {
				isDesc = true;
			}
			if (!isDesc) {
				i++;
			} else {
				i--;
			}

		}
	}
}
