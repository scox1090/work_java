package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		String[] s = sc.nextLine().split(" ");
		for (int i = 0; i < 10; i++) {
			n[i] = Integer.parseInt(s[i]);
		}
		
		int odd = 0 , even = 0;
		
		for (int i = 0; i < 10; i++) {
			if(i%2 == 0) {
				odd += n[i];
			} else {
				even += n[i];
			}
		}
		System.out.printf("odd : %d%neven : %d",odd,even);
	}
}
