package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int num = 1;
		for(;;) {
			if(num>=100) {
				break;
			}else {
			count++;
			num = sc.nextInt();
			sum += num;
			}
		}
		System.out.println(sum);
		System.out.println(Math.round(((double)sum/count)*10)/10f);
	}
}
