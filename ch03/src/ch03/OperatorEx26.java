package ch03;

public class OperatorEx26 {
public static void main(String[] args) {
	int a = 5;
	int b= 0;
	
	System.out.printf("a = %d, b = %d%n", a, b);
	System.out.printf("a != 0 || ++b !=0 = %b%n", a != 0 || ++b != 0); //or연산이기 때문에 앞의 결과만 보고 판단하고 뒤에 것은 계산 안함
	System.out.printf("a = %d, b = %d%n", a, b);
	System.out.printf("a == 0 && ++b !=0 = %b%n", a == 0 && ++b !=0); //and연산이기 때문에 앞의 결과만 보고 판단하고 뒤에 것은 계산 안함
	System.out.printf("a = %d, b= %d%n", a, b);
}
}
