package Ch05Ex;

import java.util.Scanner;

public class d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();

		int[] num = new int[amount];
		String[] numbers = sc.nextLine().split(" ");

		for (int i = 0; i < amount; i++) {
			num[i] = Integer.parseInt(numbers[i]);
		}

	}
}
