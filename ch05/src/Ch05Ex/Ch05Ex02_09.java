package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[100];
		int i = 0;

		while (true) {
			int num = sc.nextInt();
			if (num == 0)
				break;
			numbers[i] = num;
			i++;
		}
		System.out.println(i);
		
		for(int j = 0 ; j<i ; j++) {
			if(numbers[j]%2==0) {
				System.out.print(numbers[j]/2 + " ");
			}else {
				System.out.print(numbers[j]*2 + " ");
			}
		}
	}
}
