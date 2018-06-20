package ch03;

import java.util.Scanner;

public class Ch03Adv01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			String[] Input1 = scanner.nextLine().split(" ");

			int sum_ani = Integer.parseInt(Input1[0]);
			int legs = Integer.parseInt(Input1[1]);
			int puppy = sum_ani, chick = 0;

			if (sum_ani == 0 && legs == 0) {
				break;
			} else {
					if (sum_ani <= 1000 && legs <= 4000 && sum_ani >= 0 && legs >= 0) {

					for (;;) {
						puppy -= 1;
						chick = sum_ani - puppy;

						if ((puppy * 4) + (chick * 2) == legs) {
							System.out.printf("%d %d%n", puppy, chick);
							break;
						} else {
							if (puppy == 0) {
								System.out.println(0);
								break;
							}
						}
					}
				} else {
					System.out.println("INPUT ERROR!");
				}
			}
		}
	}
}
