package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
//		1���� �Է¹��� ������ �ո�ŭ�� ���ڸ� ���
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//100������ �����ϳ� �Է�
		int a = 0;
		int b = 0;
		while (a <= num) {
			b++;
			a += b;
		}
		b = 1;
		while (b <= a) {
			System.out.print(b++ + " ");
		}
	}
}
/*
 *1���� �Է¹��� �������� ��
 *int sum = 0;
 *int i = 1;
 *
 *while(i<=num){
 *		sum += i;
 *		i++;
 *}
 *system.out.println(sum)
 *
 */