package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_03 {
public static void main(String[] args) {
	String[] Alphabet = new String[10];
	Scanner sc = new Scanner(System.in);
	String[] input = sc.nextLine().split(" ");
	for(int i=0;i<Alphabet.length;i++){
		Alphabet[i] = input[i];
	}
	for(int i=0;i<Alphabet.length;i++){
		if((i+1)%3==1 && i<8)
		System.out.print(Alphabet[i]+ " ");
	}
}
}
