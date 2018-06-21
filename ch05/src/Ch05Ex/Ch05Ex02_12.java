package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[] score = new int[10];
		
		for(int i = 0 ; i <100 ; i++) {
			int number = sc.nextInt();
			if(number == 0) 
				break;	
			score[(number/10)-1] +=1;
		}
		
		for(int i = score.length-1 ; i >= 0 ; i--) {
			if(score[i]!=0)
				System.out.printf("%d : %d person%n",(i+1)*10, score[i]);
		}
	}
}
