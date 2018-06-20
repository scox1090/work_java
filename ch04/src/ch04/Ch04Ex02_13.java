package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
//		행과 열 입력
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int j = 0;
		for(int i = 1 ; i<=x;i++) {
			for(j=i;j<=y*i;) {
				System.out.print(j+ " ");
				j=j+i;
			}
			System.out.println();
		}
	}
}