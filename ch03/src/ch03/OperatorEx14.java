package ch03;

public class OperatorEx14 {
	public static void main(String[] args) {
		char c = 'a';
		
		for (int i = 0; i < 26; i++) {		//�� {} ���� ������ 26���� �ݺ��Ѵ�.
			System.out.print(c++);		//'a'���� 26���� ���ڸ� ����ϳ�.
		}
		
		System.out.println();					//�� �ٲ�
		
		c = 'A';
		
		for (int i = 0; i < 26; i++) {		// �� {} ���� ������ 26�� �ݺ��Ѵ�.
			System.out.print(c++);		//'A'���� 26���� ���ڸ� ����Ѵ�.
		}
		
		System.out.println();					//�� �ٲ�
		
		c = '0';
		
		for (int i = 0; i < 10; i++) {		// �� {} ���� ������ 26�� �ݺ��Ѵ�.
			System.out.print(c++);		//'A'���� 26���� ���ڸ� ����Ѵ�.
		}
		
		System.out.println();					// �ٹٲ�
	}
}