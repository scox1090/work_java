package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[][] num = {
				{3,5,9},
				{2,11,5},
				{8,30,10},
				{22,5,1}
		};
		int sum = 0;
		for(int i = 0; i<4 ; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(num[i][j]+" ");
				sum += num[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}
