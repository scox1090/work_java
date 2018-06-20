package ch04;

import java.util.Scanner;

public class Ch04Ex01_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력하세요.>");
		String[] input = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
		// (1-dog 2-cat 3-chick) 정수 하나 입력
		
		if(num1 == 1)
			System.out.println("dog");
		else if(num1 == 2)
			System.out.println("cat");
		else if(num1 == 3)
			System.out.println("chick");
		else
			System.out.println("I don\'t know");
	}
}