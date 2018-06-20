package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0, min = -55, i = 0;
		int[] numbers = new int[100];
		
		while (true) {
			int num = sc.nextInt();
			if(num == 999)
				break;
			numbers[i] =num;
			i++;
		}
		
		for(int j = 0 ; j < i ; j++) {
			max = max > numbers[j] ? max : numbers[j];
			min = min < numbers[j] ? min : numbers[j];
		}
		System.out.printf("max : %d%nmin : %d",max,min);
	}
}
