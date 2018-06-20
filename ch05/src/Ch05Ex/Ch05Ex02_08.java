package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[100];
		int i = 0, count = 0, sum = 0;

		while (true) {
			int num = sc.nextInt();
			if (num == 0)
				break;
			numbers[i] = num;
			i++;
		}

		for (int j = 0; j < i; j++) {
			if (numbers[j] % 5 == 0) {
				count++;
				sum += numbers[j];
			}
		}
		System.out.printf("Multiples of 5 : %d%nsum: %d%navg : %.1f", count, sum, (float)sum / count);
	}
}
