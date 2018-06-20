package ch04;

public class FlowEx16 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {			//for문에서 선언해준 j는 for문을 벗어나는 순간 사라진다.
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
