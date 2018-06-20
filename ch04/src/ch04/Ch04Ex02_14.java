package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
//		행과 열 입력
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		for(int j = 1; j<=9;j++) {
			for(int i = x; i>=y;i--) {
				System.out.printf("%d*%d=%2d		",i,j,i*j);
			}
			System.out.println();
		}
	}
}