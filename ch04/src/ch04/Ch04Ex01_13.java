package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
		// 1~12�� �ϳ� �Է�('��'�� �Է¹���)
		
		switch(num1) {
		case 1 : 	case 3 :		 case 5 :
		case 7: 		case 8: 		case 10: 
		case 12: 
			System.out.println("31");
			break;
		
		case 4:		case 6: 		case 9:
		case 11:
			System.out.println("30");
			break;
			
		case 2 : System.out.println("28");
		break;
		}
	}
}
/*if�� �����ϰ� ����� ��
 * if(1 <= month && month <= 12){
 * 		boolean isOdd = month %2 !=0;
 * 		boolean is9OrLess = month <=9;
 * 		boolean isOctDec = month == 10 || month 12;
 * 
 * 		if(isOdd && is9OrLess || isOctDec){
 * 			system.out.println(31);
 * 		} else if (month == 2) {
 * 			system.out.pritnln(28);
 * 		} else {
 * 			system.out println(30);
 * */