package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

//		������ ������ ������ ��� �ڵ� ����
		for(;;) {
//			������ �Է¹���
			num = sc.nextInt();
			if(num == -1) {
				break;
				
//				�Է¹��� ���ڰ� 3�� ����̸� 3���� ���� ���� ���
			} else if(num%3==0) {
				System.out.println(num/3);
			}
		}
	
	}
}