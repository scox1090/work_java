package ch03;

import java.util.Scanner;

public class Ch03Ex01_05 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String  input1 = scanner.nextLine();
	String  input2 = scanner.nextLine();
	
	int num1 = Integer.parseInt(input1);
	int num2 = Integer.parseInt(input2);
	
	System.out.printf("%d < %d --- %s%n",num1, num2, num1 > num2);
	System.out.printf("%d > %d --- %s%n",num1, num2, num1 < num2 ? true : false);
	System.out.printf("%d >= %d --- %s%n",num1, num2, num1 >= num2 ? true : false);
	System.out.printf("%d <= %d --- %s%n",num1, num2, num1 <= num2 ? true : false);

}
}
