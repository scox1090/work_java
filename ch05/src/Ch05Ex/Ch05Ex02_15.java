package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[][] num = new int[4][3];
		for(int i = 0 ; i < 4; i++) {
			System.out.printf("%dclass? ",i+1);
			String[] number = sc.nextLine().split(" ");
			for(int j = 0 ; j < 3; j++) {
				num[i][j] = Integer.parseInt(number[j]);
			}
		}
		for(int i = 0 ; i < 4; i++) {
			int sum = 0;
			for(int j = 0 ; j < 3; j++) {
				sum += num[i][j];
			}
			System.out.printf("%dclass : %d%n",i+1,sum);
		}
	}
}
