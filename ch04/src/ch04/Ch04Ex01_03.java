package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {
//		���̸� �Է��Ѵ�.
		Scanner sc = new Scanner(System.in); //���� �Է�
		int age = sc.nextInt();
		
//		���̰� 20�� �̻��̸� 'adult'��� ����ϰ�, �ƴϸ� 20�� �̻��� �Ƿ��� �� �� ���Ҵ��� ���
		if(age>=20)
			System.out.println("adult");
		else
			System.out.printf("%d years later",20-age);
	}
}