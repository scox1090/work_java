package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
//		정수 1개 입력
		
		if(num1 == 0)
			System.out.println("zero");
		else if (num1 > 0)
			System.out.println("plus");
		else 
			System.out.println("minus");
	}
}