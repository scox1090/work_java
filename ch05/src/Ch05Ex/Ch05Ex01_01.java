package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
//		1.���� 10���� �����ϴ� �迭
		Scanner sc = new Scanner(System.in);
		String[] alphabets = sc.nextLine().split(" ");
		
//		2�Է¹��� ���ڿ� �迭�� ���ڹ迭�� ����
		char[] result = new char[alphabets.length];
		for(int i=0; i<alphabets.length; i++) {
			//1.alphabets String �迭�� ����ִ� ���ĺ� ���ڿ� �ϳ��� ������ ����.
		 result[i] = alphabets[i].charAt(0);
		 System.out.print(result[i]);
		}
	}
}
