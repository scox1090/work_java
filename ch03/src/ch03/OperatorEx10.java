package ch03;

public class OperatorEx10 {
	public static void main(String[] args) {
		int a = 1000000;

		long result1 = a *(long) a / a; // 1000000 * 1000000 /1000000 -> 1000000000000 / 1000000 ->1000000
		int result2 = a / a * a; // 1000000 / 1000000 *1000000 -> 1 * 1000000 -> 1000000

		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result2);
	}
}
