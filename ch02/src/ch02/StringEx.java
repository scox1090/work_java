package ch02;

public class StringEx {
	public static void main(String[] args) {
		/*
		 * ���ڿ� + any type > ���ڿ�  + ���ڿ� > ���ڿ�
		 * any type + ���ڿ� > ���ڿ� + ���ڿ� > ���ڿ�
		 */
		String name = "Ja" + "va"; //���ڿ� + ���ڿ� = ���ڿ�
		String str = name + 8.0; // ���ڿ� + double = ���ڿ�
		
		// sysout �Է� �� Ctrl + Space bar
		System.out.println(name); //������ "Java" ���
		System.out.println(str);  // "Java" + "8.0" (double���� ���ڿ��� ����ȯ)
		System.out.println(7 + " "); //int�� 7�� ���ڿ��� ����ȯ
		System.out.println(" " + 7); //int�� 7�� ���ڿ��� ����ȯ
		System.out.println(7 + ""); //int�� 7�� ���ڿ��� ����ȯ
		System.out.println("" + 7); //int�� 7�� ���ڿ��� ����ȯ
		System.out.println(7 + 7 + ""); // 7 + 7 �� ����� ���ڿ��� ���ؼ� ���ڿ� "14"
		System.out.println("" + 7 + 7); // "" + 7 �� ���(���ڿ� 7)�� 7�� ���ؼ� ���ڿ�
		
	}
}