package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		for(;;) {
			int num = sc.nextInt();
			if(num == 0) {
				break;
			} else if(num%3!=0 && num%5!=0) {
				n++;
			}
		}
		System.out.println(n);
	}
}
