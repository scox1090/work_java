package ch02;

import java.util.Scanner;
public class ScannerEx {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.print("���ڸ� ������ �ϳ� �̷����ּ���.>");
		 String input = scanner.nextLine();
		 int num = Integer.parseInt (input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		 
		 System.out.println("�Է³��� :"+input);
		 System.out.printf("num=%d%n", num);
	 }
}