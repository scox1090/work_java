package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] numbers = scanner.nextLine().split(" ");
	int num1 = Integer.parseInt(numbers[0]);
	int num2 = Integer.parseInt(numbers[1]);
	int num3 = Integer.parseInt(numbers[2]);
	
//	3���� ������ �Է¹޾� ����� ���ϱ�
	double avg = (num1 + num2 + num3)/3.0;
	
//	��� ���
	System.out.printf("%.1f", avg);

	}
}