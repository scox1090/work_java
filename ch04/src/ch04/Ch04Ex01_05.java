package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
//		실수 두개를 입력받는다.
		Scanner sc = new Scanner(System.in); //실수 2개 입력
		String[] input = sc.nextLine().split(" ");
		Double num1 = Double.parseDouble(input[0]);
		Double num2 = Double.parseDouble(input[1]);
	
//		입력받은 실수들이 조건에 충족할 때까지 비교하여 등급을 매긴다.
		if(num1>=4.0 && num2>=4.0)
			System.out.println("A");
		else if(num1>=3.0 && num2>=3.0)
			System.out.println("B");
		else
			System.out.println("C");
	}
}