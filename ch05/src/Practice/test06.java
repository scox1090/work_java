package Practice;

import java.util.Scanner;

public class test06 {
public static void main(String[] args) {
	int[] num = new int[10];
	Scanner sc = new Scanner(System.in);
	String[] in = sc.nextLine().split(" ");
	int min = Integer.parseInt(in[0]);
	
	for(int i = 1 ; i < in.length ; i++) {
		min = min < Integer.parseInt(in[i]) ? min : Integer.parseInt(in[i]);
	}
	System.out.println(min);
	
}
}
