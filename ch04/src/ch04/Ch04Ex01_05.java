package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
//		�Ǽ� �ΰ��� �Է¹޴´�.
		Scanner sc = new Scanner(System.in); //�Ǽ� 2�� �Է�
		String[] input = sc.nextLine().split(" ");
		Double num1 = Double.parseDouble(input[0]);
		Double num2 = Double.parseDouble(input[1]);
	
//		�Է¹��� �Ǽ����� ���ǿ� ������ ������ ���Ͽ� ����� �ű��.
		if(num1>=4.0 && num2>=4.0)
			System.out.println("A");
		else if(num1>=3.0 && num2>=3.0)
			System.out.println("B");
		else
			System.out.println("C");
	}
}