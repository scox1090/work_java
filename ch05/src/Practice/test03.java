package Practice;

import java.util.Scanner;

public class test03 {
public static void main(String[] args) {
	char[] ch = new char[10];
	Scanner sc = new Scanner(System.in);
	String[] in = sc.nextLine().split(" ");
	for(int i = 0 ; i < in.length ; i++) {
		ch[i] = in[i].charAt(0);
		if(i == 0 || i == 3 || i == 6)
		System.out.print(ch[i]+ " ");
	}
}
}
