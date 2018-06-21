package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String[] number = sc.nextLine().split(" ");
		int[] num = new int[10];
		for(int i = 0 ; i<number.length;i++) {
			num[i] = Integer.parseInt(number[i]);
		}
		
		for(int i = 0; i<num.length-2; i++) {
			num[i+2] = (num[i] + num[i+1])%10;
		}
		
		for(int i = 0; i<10; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
