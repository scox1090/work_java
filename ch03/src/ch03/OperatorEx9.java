package ch03;

public class OperatorEx9 {
	public static void main(String[] args) {
		int a = 1_000_000; // 1,000,000 1백만
		int b = 2_000_000; // 2,000,000 2백만

		// 대입연산자(=) 오른족부터 계산한 다음 왼쪽으로 대입한다.
		// int a , int b 곱한 결과는 int 타입이다.
		// 곱합 결과가 int 범위를 초과하므로 오버플로우가 일어남
		// -1454759936 값으로 계산된 것이다.
		long c = a * b; // a * b = 2,000,000,000,000 ?

		System.out.println(c);
	}
}
