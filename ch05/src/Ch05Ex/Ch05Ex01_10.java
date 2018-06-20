package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] alphabets = new int[100];
		char[] result = new char[20]; 
		
		while (true) {
			String input = sc.nextLine(); 
			int num = input.charAt(0);
			if ('A'<=num && num <= 'Z') {
				alphabets[(int) (input.charAt(0) - 'A')] += 1;
			}else {
				break;
			}
		}

		for (int i = 0; i < alphabets.length; i++) {
			if(alphabets[i]==0) {
			}else {
			System.out.printf("%s : %d%n",(char)(i+'A'),alphabets[i]);
			}
		}
	}
}
