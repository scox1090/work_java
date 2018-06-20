package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int Mheight = scanner.nextInt();
		int Mwidth = scanner.nextInt();
		int Kheight = scanner.nextInt();
		int Kwidth = scanner.nextInt();
		
	   boolean a = Mheight > Kheight;
	   boolean b = Mwidth > Kwidth;
	   
	   boolean result = a && b;
	   
	   System.out.println(result);
		}
}
