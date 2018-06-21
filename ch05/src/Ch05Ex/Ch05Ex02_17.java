package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] num = new int[4][2];

		for (int i = 0; i < 4; i++) {
			String[] number = sc.nextLine().split(" ");
			for (int j = 0; j < 2; j++) {
				num[i][j] = Integer.parseInt(number[j]);
			}
		}

		for (int i = 0; i < 4; i++) {
			int sum = 0;
			for (int j = 0; j < 2; j++) {
				sum += num[i][j];
			}
			System.out.print(sum / 2 + " ");
		}

		System.out.println();
		
		for (int j = 0; j < 2; j++) {
			int sum = 0;
			for (int i = 0; i < 4; i++) {
				sum += num[i][j];
			}
			System.out.print(sum / 4 + " ");
		}

		System.out.println();
		int sum = 0;

		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 4; i++) {
				sum += num[i][j];
			}
		}
		System.out.print(sum / (4*2) + " ");
	}
}
