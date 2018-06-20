package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String[] args) {
//		몸무게를 실수로 입력받는다.
		Scanner sc = new Scanner(System.in); //몸무게 입력
		String input = sc.nextLine();
		Double weight = Double.parseDouble(input);
		
//		몸무게가 해당하는 체급을 출력한다.
		if(weight<=50.8)
			System.out.println("Flyweight");
		else if(weight<=61.23)
			System.out.println("Lightweight");
		else if(weight<=72.57)
			System.out.println("Middleweight");
		else if(weight<=88.45)
			System.out.println("Cruiserweight");
		else
			System.out.println("Heavyweight");
	}
}