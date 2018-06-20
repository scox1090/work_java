package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = new int [6];
		int[]	numbers = new int[10];
		
		String[] num = sc.nextLine().split(" ");
		for(int i = 0 ; i<10; i++) {
			numbers[i] = Integer.parseInt(num[i]);
		}
		
		for(int i = 0 ; i<10; i++) {
			dice[numbers[i]-1] +=1;
		}
		
		for(int i = 0 ; i<dice.length; i++) {
			System.out.println((i+1) +":" + dice[i]);
		}
	}
}
