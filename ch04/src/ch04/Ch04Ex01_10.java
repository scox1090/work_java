package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
//		���� 2�� �Է�
		
		if(num1 >= num2)
			System.out.println(num1 - num2);
		else
			System.out.println(num2 - num1);
		
//		���� : �޼ҵ带 ����ϴ� ���
//		Math.abs() : ���밪�� �����ϴ� �޼ҵ�
		/*
		System.out.println(Math.abs(num1 - num2));
		*/
	}
}