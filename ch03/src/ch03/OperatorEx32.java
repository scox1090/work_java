package ch03;

public class OperatorEx32 {
	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		// (조건) ? (조건이 참일 경우 실행) : (조건이 거짓일 경우 실행)
		absX = x >= 0 ? x : -x; //x의 값이 음수이면, 양수로 만든다.( ?의 의미 : 앞의 조건이 참이면  왼쪽항의 것을 아니면 오른쪽항에 있는 것을 수행한다.)
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;

		signX = x > 0 ? '+' : (x == 0 ? ' ' : '-'); // 조건 연사자(삼한 연산자)를 중첩
		signY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
		signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');

		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}
}
