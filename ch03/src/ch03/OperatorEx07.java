package ch03;

public class OperatorEx07 {
public static void main(String[] args) {
	byte  a = 10;
	byte  b = 30;
	byte c = (byte) (a * b);
	System.out.println(c);
	
	/*
	 * 예제 6번과 같은 이야기.
	 * 곱셈도 마찬가지로 자바에서 정수의 기본형이 int형으로 변경 후 곱셈을 수행한다.
	 * 결론은 되도록 int를 써라 (@o@))
	 */
}
}