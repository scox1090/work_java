package test02;

public class ObjectTest {
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1.equals(str2)); 	//equals는 값만 비교하기 때문에 정해져있지 않은생성자끼리 비교할 때 자주 사용한다.
		System.out.println(!str1.equals(str2));	//변수.equals(변수)앞에 !를 붙이면 부정이 된다.
	}
}
