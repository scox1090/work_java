package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");

		long[] num = new long[input.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Long.parseLong(input[i]);
		}
		long max = 0, min = 0;
		for (int i = 0; i < num.length-1; i++) {
			if (num[i] < 100 && num[i + 1] < 100) {
				max = num[i]>num[i+1] ? num[i] : num[i+1];
			} else if (num[i] >= 100 && num[i + 1] >= 100) {
				min = num[i]<num[i+1] ? num[i] : num[i+1];
			}
		}
		System.out.print(max + " " + min);
	}
}
