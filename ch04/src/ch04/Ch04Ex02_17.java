package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		// 행과 열 입력
		int x = Integer.parseInt(input[0]);
		int n = 0;
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x;j++) {
				if(i>j) {
					System.out.print("  ");
				} else {	
					n++;
					System.out.print(n%10 + " " );
				}
			}
			System.out.println();
		}
	}
}
