package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		// 입력받기 위해 scanner객체 생성, System.in은 키보드
		Scanner scanner = new Scanner(System.in);

		// scanner를 통해 입력받기 (3번)
		String strkor = scanner.nextLine();
		String strmat = scanner.nextLine();
		String stravg = scanner.nextLine();

		// 문자열로 받은 성적들을 정수형으로 변환
		int kor = Integer.parseInt(strkor);
		int mat = Integer.parseInt(strmat);
		int eng = Integer.parseInt(stravg);

		// 합계와 평균 구하기
		int sum = kor + mat + eng;
		int avg = sum / 3;

		// printf()를 이용하여 출력
		System.out.printf("kor %d%n", kor);
		System.out.printf("mat %d%n", mat);
		System.out.printf("eng %d%n", eng);
		System.out.printf("sum %d%n", sum);
		System.out.printf("avg %d%n", avg);

	}
}