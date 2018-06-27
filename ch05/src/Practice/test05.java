package Practice;

import java.util.Scanner;

public class test05 {
public static void main(String[] args) {
	Double[] num = {85.6,79.5,83.1,80.0,78.2,75.0};
	Scanner sc = new Scanner(System.in);
	String[] in = sc.nextLine().split(" ");
	double sum = 0d;
	for(int i = 0 ; i <in.length ; i++) {
		int nums = Integer.parseInt(in[i]);
		sum += num[nums-1];
	}
	System.out.printf("%.1f",sum);
}
}
