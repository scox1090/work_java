package ch03;

public class Exercise3_1 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'�� �����ڵ�� 65
		System.out.println(1 + x << 33); // int(32bit)�̹Ƿ� 33ĭ �̵��� 1ĭ �̵� -> 000000000000000000000110
		System.out.println(y >= 5 || x < 0 && x > 2); // '&&'�� '||'���� ���� Ǯ�̵ȴ�.
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
	}
}