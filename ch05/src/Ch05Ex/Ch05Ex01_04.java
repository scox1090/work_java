package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_04 {
public static void main(String[] args) {
	int[] num = new int[100];
	int count = 1;
	Scanner sc = new Scanner(System.in);
	String[] input = sc.nextLine().split(" ");
	for(int i=0;i<num.length;i++){
		if(Integer.parseInt(input[i])==0)
			break;
		num[i] = Integer.parseInt(input[i]);
		count++;
	}
	for(int i=count-2;i>=0;i--){
		System.out.print(num[i]+ " ");
	}
}
}
