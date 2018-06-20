package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double[] classavg = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		int[] num = new int[2];
		String[] input = sc.nextLine().split(" ");
		for (int i = 0; i < 2; i++) {
			num[i] = Integer.parseInt(input[i]) - 1;
		}
		System.out.println((classavg[num[0]] + classavg[num[1]]));
	}
}
