package Practice;

import java.util.Scanner;

public class test04 {
public static void main(String[] args) {
	int[] num = new int[100];
	Scanner sc = new Scanner(System.in);
	
	for(int i = 0 ; i < num.length ; i++) {
		int nums = sc.nextInt();
		if(nums == 0)
			break;
		num[i] = nums;
	}
	
	for(int i = num.length-1 ; i >= 0 ; i--) {
		if (num[i] != 0)
		System.out.print(num[i]+ " ");
	}
}
}
