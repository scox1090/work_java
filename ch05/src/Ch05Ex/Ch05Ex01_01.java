package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
//		1.문자 10개를 저장하는 배열
		Scanner sc = new Scanner(System.in);
		String[] alphabets = sc.nextLine().split(" ");
		
//		2입력받은 문자열 배열을 문자배열로 변경
		char[] result = new char[alphabets.length];
		for(int i=0; i<alphabets.length; i++) {
			//1.alphabets String 배열에 들어있는 알파벳 문자열 하나를 끄집어 낸다.
		 result[i] = alphabets[i].charAt(0);
		 System.out.print(result[i]);
		}
	}
}
