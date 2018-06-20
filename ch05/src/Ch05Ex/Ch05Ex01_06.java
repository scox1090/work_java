package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_06 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int tmp = 0;
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		for(int i=0;i<num.length;i++){
			num[i] = Integer.parseInt(input[i]);
		}
		tmp = num[0];
		for(int i=1;i<num.length;i++){
			tmp = tmp<num[i] ? tmp : num[i];
		}
		System.out.println(tmp);
	}
}
