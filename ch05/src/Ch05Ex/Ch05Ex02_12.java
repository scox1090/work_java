package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[] numbers = new int[10];
		int[] result = new int[20]; 
		
		while (true) {
			String input = sc.nextLine(); 
			int num = Integer.parseInt(input);
			if (num != 0) {
				numbers[(int)(num/10f)] += 1;
			}else {
				break;
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0) {
			}else {
			System.out.printf("%d : %d%n",i,numbers[i]);
			}
		}
	}
}
