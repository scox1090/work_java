package ch04;

import java.util.Scanner;

public class Ch04Ex02_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i<=4; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.printf("%d*%d=%d%3s",i,j,i*j,' ');
			}
			System.out.println();
		}
	}
}
