package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
//		���ڸ� �ϳ� �Է� �޴´�.
		Scanner sc = new Scanner(System.in);//���� �ϳ� �Է�
		int num = sc.nextInt();
		System.out.println(num);
		
//		�Է¹��� ���ڰ� �����ΰ��� Ȯ���Ѵ�.
		if (num <= 0)
			System.out.println("minus");
	}
}