package test02;

public class ObjectTest {
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1.equals(str2)); 	//equals�� ���� ���ϱ� ������ ���������� ���������ڳ��� ���� �� ���� ����Ѵ�.
		System.out.println(!str1.equals(str2));	//����.equals(����)�տ� !�� ���̸� ������ �ȴ�.
	}
}
