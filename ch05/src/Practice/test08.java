package Practice;

import java.util.Scanner;

public class test08 {
public static void main(String[] args) {
	int[] num = new int[10];
	Scanner sc = new Scanner(System.in);
	String[] in = sc.nextLine().split(" ");
	int even = 0, count = 0;
	double odd = 0d;
	
	for(int i = 0 ; i < in.length ; i++) {
		num[i] = Integer.parseInt(in[i]);
		if(i%2 == 1)
			even += num[i];
		if(i%2 == 0) {
			odd += num[i];
			count++;
		}
	}
	System.out.printf("sum : %d%navg : %.1f",even, odd/count);
}
}
