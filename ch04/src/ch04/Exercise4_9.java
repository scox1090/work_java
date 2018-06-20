package ch04;

public class Exercise4_9 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int i = 1;
		while(i>=num) {
			i*=10;
		}
		i/=10;
//		while(i<=0;)
		System.out.println("sum="+sum);	
	}
}
