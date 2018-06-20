package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] num = new int[input.length];
		
		for(int i=0 ; i<input.length;i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		
		int sum1 = 0,sum2 = 0, count = 0;
	
		for(int i=0 ; i<input.length;i++) {
			if(i%2!=0) {
				sum1 += num[i];
			}else if(i%2==0){
				sum2 += num[i];
				count++;
			}
		}
		
		float avg = sum2/(float)(count);
		System.out.printf("sum : %d%navg:%.1f",sum1, avg);
	}
}
