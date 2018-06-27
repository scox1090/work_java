package Practice;

import java.util.Scanner;

public class test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[100];
		for (int i = 0; i < 100; i++) {
			char in = sc.nextLine().charAt(0);
			if ('A' <= in && in <= 'Z') {
				ch[in - 'A']++;
			} else {
				break;
			}
		}
		for (int i = 0; i < 100; i++) {
			if(ch[i]==0)
				break;
			System.out.printf("%s  %d",'A'+i , ch[i]);
		}
	}
}
