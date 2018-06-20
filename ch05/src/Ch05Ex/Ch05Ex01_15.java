package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][4];
		int i = 0;
		while (true) {
			String[] input = sc.nextLine().split(" ");
			for (int j = 0; j < 4; j++) {
				score[i][j] = Integer.parseInt(input[j]);
			}
			i++;
			if (i == 4)
				break;
		}
		System.out.println();

		int pass = 0;

		for (i = 0; i < 5; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += score[i][j];
			}
			if (sum / 4 >= 80) {
				System.out.println("pass");
				pass++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.printf("Successful : %d", pass);
	}
}
