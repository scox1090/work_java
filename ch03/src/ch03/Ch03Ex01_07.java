package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String input1 = scanner.nextLine();
	String input2 = scanner.nextLine();
	String input3 = scanner.nextLine();
	
	int num1 = Integer.parseInt(input1);
	int num2 = Integer.parseInt(input2);
	int num3 = Integer.parseInt(input3);

	boolean a1 = num1 > num2;
	boolean b1 = num1 > num3;
	boolean result1 = a1 && b1;
	boolean a2 = num1 == num2;
	boolean b2 = num2 == num3;
	boolean result2 = a2 && b1;
	
	System.out.printf("%b ",result1);
	System.out.printf("%b ",result2);
	
}
}
