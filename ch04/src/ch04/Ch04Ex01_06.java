package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
//		���ڿ��� ���� �ϳ��� �Է¹޴´�.
		Scanner sc = new Scanner(System.in); //����(M-����,F-����)�� ���� �Է�
		String[] input = sc.nextLine().split(" ");
		
		char gender = input[0].charAt(0);
		int age = Integer.parseInt(input[1]);

//		���� ���� �����ϰ� �������� �ƴ��� ���Ͽ� ���
		if (gender == 'M') {
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else if (gender == 'F') {
			if (age >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		}
	}
}