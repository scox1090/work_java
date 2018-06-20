package ch03;

public class OperatorEx06 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		// byte c = a + b; // 컴파일 에러가 발생한다. 명시적으로 형변환이 필요하다.
		byte c = (byte) (a + b);

		/*
		 * 자바에서의 정수형의 기본형은 int이기 때문에 byte로 명시 했더라도 계산할 때 다시 명시적으로 형변환이 필요하다. 별일 없으면 걍
		 * int를 쓰세요 (-^^-)7
		 */
		System.out.println(c);
	}
}