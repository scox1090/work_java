package ch03;

public class OperatorEx06 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		// byte c = a + b; // ������ ������ �߻��Ѵ�. ���������� ����ȯ�� �ʿ��ϴ�.
		byte c = (byte) (a + b);

		/*
		 * �ڹٿ����� �������� �⺻���� int�̱� ������ byte�� ���� �ߴ��� ����� �� �ٽ� ���������� ����ȯ�� �ʿ��ϴ�. ���� ������ ��
		 * int�� ������ (-^^-)7
		 */
		System.out.println(c);
	}
}