package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0, even = 0;
		for (;;) {
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}else if (num % 2 == 1)
				odd += 1;
			else
				even += 1;
		}
		System.out.println("odd : "+odd);
		System.out.println("even : " + even);
	}
}
