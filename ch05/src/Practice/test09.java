package Practice;

import java.util.Scanner;

public class test09 {
	public static void main(String[] args) {
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(" ");
		int tmp = 0;
		for (int i = 0; i < in.length; i++) {
			num[i] = Integer.parseInt(in[i]);
		}
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1-i; j++) {
				if (num[j] < num[j + 1]) {
					tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < in.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
