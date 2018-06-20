package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
//		문자열과 정수 하나씩 입력받는다.
		Scanner sc = new Scanner(System.in); //성별(M-남자,F-여자)과 나이 입력
		String[] input = sc.nextLine().split(" ");
		
		char gender = input[0].charAt(0);
		int age = Integer.parseInt(input[1]);

//		남녀 구분 먼저하고 성인인지 아닌지 비교하여 출력
		if (gender == 'M') {
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else if (gender == 'F') {
			if (age >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		}
	}
}