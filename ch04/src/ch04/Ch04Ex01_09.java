package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
//		3���� ������ �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
		int num3 = Integer.parseInt(input[2]);
//		�������� �Ͻ� ���
		int min01 = num1 < num2 ? num1 : num2;
		int min02 = min01 < num3 ? min01 : num3;
		
		System.out.println(min02);
		
		/* ������ ���
		if (num1 < num2 && num1 < num3)
			System.out.println(num1);
		if (num2 < num1 && num2 < num3)
			System.out.println(num2);
		if (num3 < num1 && num3 < num2)
			System.out.println(num3);
			*/
	}
}