package ch04;

public class Exercise4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		while (tmp != 0) {
			String str = "" ;
			String str2 = Integer.toString(number);
			for(int i=0; i<str2.length(); i++) {
				result = tmp%10;
				str +=Integer.toString(result);
				tmp /=10;
			}
			result = Integer.parseInt(str);
		}
		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	} // main
}