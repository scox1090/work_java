package ch03;

public class Exercise3_9 {
	public static void main(String[] args) {
		char ch = '1';
		boolean b =ch >='A' && ch <= 'Z' || ch >='a' && ch<='z' || (int)ch >= 0 ? true : false ;
		System.out.println(b);
		}
}
