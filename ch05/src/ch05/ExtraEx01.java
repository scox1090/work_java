package ch05;

public class ExtraEx01 {
	public static void main(String[] args) {
		//charAt() ����
		
		String a = "KOITT";
		String b = "APPLE";
		String c = "CAR";
		
		// 1. charAt()�� �̿��Ͽ� ����  result�� "KOREA�� ��ƺ�����.
		char[]	 result = new char[5];
		result[0] = a.charAt(0);
		result[1] = a.charAt(1);
		result[2] = c.charAt(2);
		result[3] = b.charAt(4);
		result[4] = b.charAt(0);
		// 2. 1������ ���� "KOREA"�� ����غ�����.
		for(int i = 0 ; i<result.length;i++) 
			System.out.print(result[i]);
		}
}
