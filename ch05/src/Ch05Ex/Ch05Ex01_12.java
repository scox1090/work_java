package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] result = new int[100];
		result[0] = 100;
		result[1] = sc.nextInt();

		for (int i = 0; i < result.length; i++) {
			result[i + 2] = result[i] - result[i + 1];
			if (result[i + 2] < 0) {
				break;
			}
		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0) {
				break;
			} else {
				System.out.print(result[i] + " ");
			}
		}
	}
}
