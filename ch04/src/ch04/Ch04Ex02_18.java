package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		// 행과 열 입력
		int x = Integer.parseInt(input[0]);
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x;j++) {
				if(i+1>j) {
					System.out.print("#");
				} else {	
					System.out.print("	");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x;j++) {
				if(i+1>j) {
					System.out.print(" ");
				} else {	
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}
