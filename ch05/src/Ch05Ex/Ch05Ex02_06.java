package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] alphabets = {'A','P','P','L','E'};
		String s = sc.nextLine();
		int i = 0;
		for(i = 0 ; i < alphabets.length ; i++) {
			if(s.charAt(0) == alphabets[i])
				break;
		}
		System.out.println(i);
	}
}
