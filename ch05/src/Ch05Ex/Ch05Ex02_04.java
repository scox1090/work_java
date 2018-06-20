package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[100];
		String[] s = sc.nextLine().split(" ");
		int i = 0;
		for( i = 0 ; i <= n.length ; i++) {
			 n[i] = Integer.parseInt(s[i]);
			 if(n[i] == -1)
				 break;
		}
		int start = i-3;
		while(true) {
			System.out.print(n[start] + " ");
			if(start == i-1) 
				break;
			start++;
		}
	}
}
