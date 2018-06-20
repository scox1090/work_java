package ch03;

public class OperatorEx15 {
	public static void main(String[] args) {
		// 'a'의 아스키 코드 값은 97
		// 'A'의 아스키 코드 값은 65
		// 대문자 'A'와 소문자 'a'의 차이는 32
		// 따라서 'A'에 +32하면 소문자 'a'
		// 소문자 'a'에 -32하면 대문자'A'가된다.
		char lowerCase = 'b';
		char upperCase = (char) (lowerCase - 32); // 97 - 32 = 65 = 'A'

		System.out.println(upperCase); // 'A'
	}
}
