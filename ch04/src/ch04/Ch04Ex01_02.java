package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
//		Ű�� �����Ը� �Է¹޴´�. 
		Scanner sc = new Scanner(System.in); //Ű ������ �Է�
		int height = sc.nextInt();
		int weight = sc.nextInt();
		
//		������ ����Ͽ� �񸸵��� �����Ѵ�.
		int BMI = weight + 100 - height;
		System.out.println(BMI);
		
//		������ ���� ���� ����� �񸸿� �ش��ϴ��� Ȯ���Ѵ�.
		if(BMI >= 0)
			System.out.println("Obesity");
	}
}