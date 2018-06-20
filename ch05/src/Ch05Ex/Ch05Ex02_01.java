package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split(" ");
		
		for(int i = 9 ; i >= 0 ; i--)
			System.out.print(s[i] + " ");
	}
}
