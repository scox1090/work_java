package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] alphabet = new char[3][5];
		
		for(int i = 0 ; i < 3 ; i++) {
			String[] capital = sc.nextLine().split(" ");
			for(int j = 0 ; j < 5 ; j++) {
				alphabet[i][j] = capital[j].charAt(0);
			}
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("%c ",alphabet[i][j]+('a'-'A'));
			}
			System.out.println();
		}
	}
}
