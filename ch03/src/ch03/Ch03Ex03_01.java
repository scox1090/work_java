package ch03;
import java.util.Scanner;
public class Ch03Ex03_01 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	double num1 = scanner.nextDouble();
	double num2 = scanner.nextDouble();
	
	
	int result1 = (int)(num1 * num2);
	int result2 = (int)num1 * (int)num2;
	
	System.out.print(result1 + " ");
	System.out.print(result2);
	}
}
