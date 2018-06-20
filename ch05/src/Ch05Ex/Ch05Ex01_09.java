package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] num = new int[input.length];
		
		for(int i=0 ; i<input.length;i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		
		for(int i = 0 ; i<num.length;i++) {
			for(int j = 0 ; j < num.length-i-1;j++) {
				if(num[j]<num[j+1]) {
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j+1] = tmp;
				}	
			}
		}
		for(int i = 0 ; i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
	}
}
