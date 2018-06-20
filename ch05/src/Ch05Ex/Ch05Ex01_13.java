package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_13 {
	public static void main(String[] args) {
		int[][] num = { 
								{ 5, 8, 10, 6, 4 },
								{ 11, 20, 1, 13, 2 }, 
								{ 7, 9, 14, 22, 3 } 
								};

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
	}
}
