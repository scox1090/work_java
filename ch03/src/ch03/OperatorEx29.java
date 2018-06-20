package ch03;

public class OperatorEx29 {
	public static void main(String[] args) {
//		비트 전환
		byte p = 10;
		byte n = -10;

		System.out.printf(" p  =%d 	\t%s%n", p, toBinaryString(p));
		System.out.printf(" p  =%d 	\t%s%n", ~p, toBinaryString(~p));	//물결은 반전의 의미
		System.out.printf(" p  =%d 	\t%s%n", ~p + 1, toBinaryString(~p + 1));
		System.out.printf(" p  =%d 	\t%s%n", ~~p, toBinaryString(~~p)); //두번 반전함 (~~p = p)
		System.out.println();
		System.out.printf(" n =%d%n", n);
		System.out.printf("(n-1)=%d%n", ~(n - 1));
	}

//	10진 정수를 2진수로 변환하는 메소드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}
}
