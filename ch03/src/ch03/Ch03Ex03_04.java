package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num1 = scanner.nextDouble();	 	//���� ������ ����
		double num2 = scanner.nextDouble();		//���� ������ ����
		double num3 = scanner.nextDouble();		//���� ������ ����
		
		System.out.printf("sum %d%n",(int)num1 + (int)num2 +(int) num3);
		System.out.printf("avg %d",(int)((num1 + num2 + num3)/3));
	}
}