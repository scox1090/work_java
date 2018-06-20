package ch04;

public class Exercise4_11 {
	public static void main(String[] args) {
		int x2 = 2, x3 = 4;
		for (int z = 1; z <= 3; z++) {
			for (int y = 1; y <= 3; y++) {
				for (int x = x2; x <= x3; x++) {
					System.out.printf("%d*%d=%d%6s", x, y, x * y, ' ');
					for (;;) {
						if (x == x3) {
							System.out.println();
							break;
						} else {
							break;
						}
					}
					if (x == 9) {
						System.out.println();
						break;
					}
				}
			}
			x2 += 3;
			x3 += 3;
			System.out.println();
		}
	}
}
