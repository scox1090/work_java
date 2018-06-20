package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		String[] s = sc.nextLine().split(" ");
		for (int i = 0; i < 5; i++) {
			n[i] = Integer.parseInt(s[i]);
		}
		System.out.println(n[0] + n[2] + n[4]);
	}
}
