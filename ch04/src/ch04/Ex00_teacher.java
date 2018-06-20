package ch04;

public class Ex00_teacher {
	public static void main(String[] args) {
		int num = 10;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j >= num - i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
