package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_10 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int amount = sc1.nextInt();
		
		int[] num = new int[amount];
		String[] numbers = sc2.nextLine().split(" ");
		
		for (int i = 0; i < amount; i++) {
			num[i] = Integer.parseInt(numbers[i]);
		}

		int tmp = 0;

		for (int i = 0; i < amount - 1; i++) {
			for (int j = 0; j < amount - 1 - i; j++) {
				if (num[j] < num[j + 1]) {
					tmp = num[j];
					num[j] = num[j+1];
					num[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < amount; i++) {
			System.out.println(num[i]);
		}
	}
}
