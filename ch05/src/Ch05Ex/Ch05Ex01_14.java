package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] num1 = new int[2][4];
		int[][] num2 = new int[2][4];

		
		for (int count = 1; count <= 2; count++) {
			String row = sc.nextLine();
			if (row.equals("first array")) {
				for (int i = 0; i < 2; i++) {
					String[] input = sc.nextLine().split(" ");
					for (int j = 0; j < 4; j++) {
						num1[i][j] = input[j].charAt(0) - '0';
					}
				}
			} else {
				for (int i = 0; i < 2; i++) {
					String[] input = sc.nextLine().split(" ");
					for (int j = 0; j < 4; j++) {
						num2[i][j] = input[j].charAt(0) - '0';
					}
				}
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(num2[i][j] * num1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
