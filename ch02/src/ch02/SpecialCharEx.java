package ch02;

public class SpecialCharEx {
	public static void main(String[] args) {
		/*
		 * Ư������(Escape sequence)
		 * tab : \t
		 * backspase : \b
		 * form feed " \f
		 * new line : \n
		 * carriage return : \r
		 * ��������(\) : \\
		 * ���� ����ǥ : \'
		 * ū ����ǥ : \"
		 * �����ڵ�(16����)���� : \\u�����ڵ� (�� : char a = '\u0041')
		 */
		System.out.println('\''); 						 // ' ' 'ó�� �� �� �־���.
		System.out.println("abc\t123\b456"); 	//\b�� ���� 3�� ��������.
		System.out.println('\n'); 						//����(new line)���� ����ϰ� ����
		System.out.println("\"Hello\""); 			//ū����ǥ�� ����Ϸ��� �̷��� �Ѵ�.
		System.out.println("c:\\");		
	}
}