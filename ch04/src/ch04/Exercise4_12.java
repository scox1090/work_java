package ch04;

public class Exercise4_12 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ ) {
		
		num3 = num1 + num2;
		System.out.print(","+num3);
		int tmp1=0, tmp2 = 0;
		tmp1 = num3;
		num3 = num2;
		tmp2 = num2;
		num2 = num1;
		num1 = tmp1; 
		}
	}
}
