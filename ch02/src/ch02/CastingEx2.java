package ch02;

public class CastingEx2 {
	public static void main(String[] args) {
		// int���� ���� 10�� byteŸ������ �������� �� -> �����ս� ����
		int i = 10;
		byte b = (byte) i;
		System.out.printf("[int -> byte] i =%d -> b=%d%n", i, b);

		// int���� ���� 300�� byte Ÿ������ �������� �� -> �����ս� �߻�
		// byte���� ���� ���� -120~127�� �ʰ��߱� ������ �����ս��� �߻��Ѵ�.
		i = 300;
		b = (byte) i;
		System.out.printf("[int -> byte] i =%d -> b=%d%n", i, b);
		System.out.println("i=" + Integer.toBinaryString(i));
		// byte���� ���� 10�� intŸ������ �������� �� -> �����ս� ����
		// intŸ���� ������ -20�� ~ +20���̱� ������ �����ս��� ����
		b = 10;
		i = (int) b;
		System.out.printf("[byte -> int] i =%d -> b=%d%n", b, i);

		// byte���� ���� -2�� int Ÿ������ �������� �� -> �����ս� ����
		b = -2;
		i = (int) b;
		System.out.printf("[byte -> int] i =%d -> b=%d%n", b, i);

		System.out.println("i=" + Integer.toBinaryString(i));
	}
}