package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex02_16 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int [][] first = new int[2][3];
		int [][] second = new int[2][3];
		
		for(int i = 0 ; i < 2 ; i++) {
			String array = sc1.nextLine();
			for(int j = 0 ; j < 2 ; j++) {
				String[] num = sc2.nextLine().split(" ");
				for(int k = 0 ; k<3; k++) {
					if(array.equals("first array")) {
						first[j][k] = Integer.parseInt(num[k]);
					} else {
						second[j][k] = Integer.parseInt(num[k]);
					}
				}
			}
		}
		
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(first[i][j]*second[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
