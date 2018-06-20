package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double sum = 0d;
		String[] s = sc.nextLine().split(" ");
		for(int i = 0 ; i < s.length ; i++) {
			sum += Double.parseDouble(s[i]);
		}
		System.out.printf("%.1f",sum/s.length);
	}
}
