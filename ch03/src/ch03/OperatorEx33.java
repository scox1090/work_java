package ch03;

public class OperatorEx33 {
public static void main(String[] args) {
	int i = 0;
	i = i + 3;
	System.out.println(i);
//	3 = i + 3; 에러. lavalue가 값을 저장할 수 있는 공간이 아니다.
//	i + 3 = i ; 에러. lavalue의 연산결과는 리터럴(i+3 → 0+3 → 3)
	
	i =0;
	i +=3;
	System.out.println(i);
	
	i = 0;
	i = i -3;
	System.out.println(i);
	
	i = 0;
	i -= 3;
	System.out.println(i);
	
	i = 1;
	i*=3;
	System.out.println(i); // i = i * 3과 동일
	
	i = 30;
	i/=3;
	System.out.println(i); // i = i / 3과 동일

}
}
