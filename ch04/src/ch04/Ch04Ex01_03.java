package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {
//		나이를 입력한다.
		Scanner sc = new Scanner(System.in); //나이 입력
		int age = sc.nextInt();
		
//		나이가 20세 이상이면 'adult'라고 출력하고, 아니면 20세 이상이 되려면 몇 년 남았는지 출력
		if(age>=20)
			System.out.println("adult");
		else
			System.out.printf("%d years later",20-age);
	}
}