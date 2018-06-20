package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
//		키와 몸무게를 입력받는다. 
		Scanner sc = new Scanner(System.in); //키 몸무게 입력
		int height = sc.nextInt();
		int weight = sc.nextInt();
		
//		공식을 사용하여 비만도를 측정한다.
		int BMI = weight + 100 - height;
		System.out.println(BMI);
		
//		공식을 통해 계산된 결과가 비만에 해당하는지 확인한다.
		if(BMI >= 0)
			System.out.println("Obesity");
	}
}