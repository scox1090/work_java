package ch03;

public class OperatorEx23 {
	public static void main(String[] args) {
		// Java 메모리 구조 그림을 통해 확인 가능
		String str1 = "abc";

		// new라는 명령어로 인해 static영역이 아닌 heap영역에 저장되어 주소값이 달라진다.
		String str2 = new String("abc");

		System.out.printf("\"abc\"== \"abc\" ? %b%n", "abc" == "abc");
		System.out.printf("str1 == \"abc\" ? %b%n", str1 == "abc");
		System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc");
		System.out.printf("str1.equals(\"abc\" ? %b%n", str1.equals("abc")); // 변수.equals() -> 변수값와 equals괄호안의 값과 비교(==)
		// ->str1 == "abc"; (true)
		System.out.printf("str2.equals(\"abc\" ? %b%n", str2.equals("abc")); // 변수.equals() -> 변수값와 equals괄호안의 값과 비교(==)
		// ->str2 == "abc"; (ture)
		System.out.printf("str2.equals(\"ABC\" ? %b%n", str2.equals("ABC")); // 변수.equals() -> 변수값와 equals괄호안의 값과 비교(==)
		// ->str2 == "ABC"; (false) 이유 : 'abc'와 'ABC'의 유니코드 주소값이 다르다.
		System.out.printf("str1.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		// ->str2 == "ABC"; (ture)
	}
}
