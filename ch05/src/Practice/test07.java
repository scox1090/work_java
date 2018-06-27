package Practice;

import java.util.Scanner;

public class test07 {
public static void main(String[] args) {
	int[] num = new int[10];
	Scanner sc = new Scanner(System.in);
	String[] in = sc.nextLine().split(" ");
	int min = 1000;
	int max = Integer.parseInt(in[0]);
	
	for(int i = 1 ; i < in.length ; i++) {
		num[i] = Integer.parseInt(in[i]);
		if(num[i] <100) {
			max = max > num[i] ? max : num[i];
		}
		if(num[i] >= 100) {
			min = min < num[i] ? min : num[i];
		}
	}
	System.out.printf("%d %d",max, min);
}
}
