package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("Base = ");
			String input1 = sc.nextLine();
			int num1 = Integer.parseInt(input1);
			System.out.print("Height = ");
			String input2 = sc.nextLine();
			int num2 = Integer.parseInt(input2);
			float area = (float)(num1 * num2)/2;
			System.out.println("Triangle area = " + area);
			System.out.print("Continue? ");
			String input = sc.nextLine();
			char q = input.charAt(0);
			if(q == 'N') {
				break;
			}
		}
	}
}
