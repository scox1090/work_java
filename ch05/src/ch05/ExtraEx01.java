package ch05;

public class ExtraEx01 {
	public static void main(String[] args) {
		//charAt() 예제
		
		String a = "KOITT";
		String b = "APPLE";
		String c = "CAR";
		
		// 1. charAt()을 이용하여 변수  result에 "KOREA를 담아보세요.
		char[]	 result = new char[5];
		result[0] = a.charAt(0);
		result[1] = a.charAt(1);
		result[2] = c.charAt(2);
		result[3] = b.charAt(4);
		result[4] = b.charAt(0);
		// 2. 1번에서 담은 "KOREA"를 출력해보세요.
		for(int i = 0 ; i<result.length;i++) 
			System.out.print(result[i]);
		}
}
