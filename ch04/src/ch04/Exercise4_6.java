package ch04;

public class Exercise4_6 {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		for (int x = 1; x <= 6; x++) {
			for (int y = 1; y <= 6; y++) {
				sum = x + y;
				System.out.printf("%d = %d + %d%n", sum, x, y);
				if (sum == 6) {
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}
