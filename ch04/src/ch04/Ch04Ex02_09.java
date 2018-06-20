package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, sum = 0;
		for(;;) {
			int num = sc.nextInt();
			i++;
			if(num >100 || num <0) {
				break;
			}else {
				sum += num;
			}
		}
		System.out.printf("sum : %d%n",sum);
		System.out.printf("avg : %.1f",(float)sum/(i-1));
	}
}
