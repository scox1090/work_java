package ch03;

public class OperatorEx01 {
	public static void main(String[] args) {
		int i = 5;
		i++; // i= i+1;�� ���� �ǹ��̴�. ++i;�� �ٲ�ᵵ ����� ����.
		System.out.println(i);

		i = 5; // ����� ���ϱ� ���� i���� �ٽ� 5�� ����.
		++i;
		System.out.println(i);
		
		/*
		 * i++�� ���� i�� ����ϰ� 1 ���� 
		 * ++i�� ���� 1 �����ϰ� ���� i�� ���
		 */
		
		i=5;
		System.out.println(i++);			// ����ϰ� 1�����̱� ������ 5 ��� , i=6;
		
		i=5;
		System.out.println(++i);			//1 �����ϰ� ����ϱ� ������ 6���, i=6;
	}
}