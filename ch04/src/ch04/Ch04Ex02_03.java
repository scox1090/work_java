package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
//		0�� �Էµ� ������ ��� �����
		for (;;) {
			if (num != 0) {
//				������ �Է¹޴´�.
				System.out.print("������ �Է��ϼ���. (0:����)>");
				num = sc.nextInt();
//				������ ������� �������� ���
				if (num > 0) {
					System.out.println("positive integer");
				} else if(num < 0 ){
					System.out.println("negative number");
				}
			} else {
				break;
			}
		}
	}
}