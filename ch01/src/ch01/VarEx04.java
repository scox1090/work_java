package ch01;

public class VarEx04 {
	public static void main(String[] args) {
				//���ͷ��� Ÿ�԰� ���̻�
				int octNum = 010;       //8���� 10, 10������ 8
				int hexNum = 0x10;   //16���� 10, 10������ 16
				int binNum = 0b10;  // 2���� 10, 10������ 2 (JDK 1.7 �������� ��밡��)
			
				long big = 100_000_000_000L;            //long big = 100000000000L;
			    long hex = 0xFFFF_FFFF_FFFF_FFFFL; // long hex = 0xFFFFFFFFFFFFFFFFL;
				
				float pi = 3.14f;               // ���̻� f ��� F�� ����ص� �ȴ�.
				double rate = 1.618d;    // ���̻� d ��� D�� ����ص� �ǰ�, �����ص� �ȴ�.
				// float pi = 3.14;           //����. floatŸ�� ������ doubleŸ�� ���ͷ� ����Ұ�
				// double rate = 1.618; // ok. ���̻� d�� ������ �� �ִ�.
				
				
				//Ÿ���� ����ġ 
				int i = 'A' ;                             // OK. ���� 'A'(char)�� �����ڵ� �� 65�� ���� i�� ����ȴ�.
				long l = 123;                         //OK. int(123)���� longŸ���� �� ������ �д�.
				double d = 3.14f;                  //OK. float(3.14f)���� doubleŸ���� �� ������ �д�.
				//int i = 0x123456789;           //����. int(0x123456789) Ÿ���� ������ �Ѵ� �� ����
				/*float f = 3.14;                     //����. float(3.14) Ÿ�Ժ��� double(���̻縦 ������ ������ doubleŸ������ �ν�)
				 											    Ÿ���� ������ �д�. -> ������ : ���ͷ��� 3.14f�� �ٲ� or floatŸ���� doubleŸ������ �ٲ�
				 */
				byte b = 65;                         //OK. byte(65)Ÿ�Կ� ���� ������ ������ int Ÿ�� ���ͷ�
			short s = 0x1234;               //OK. short(0x1234)Ÿ�Կ� ���� ������ ������ intŸ�� ���ͷ�
			
			System.out.println(octNum);
			System.out.println(hexNum);
			System.out.println(binNum);
			
			System.out.println(big);
			System.out.println(hex);
			System.out.println(pi);
			System.out.println(rate);
			
			System.out.println(i);
			System.out.println(l);
			System.out.println(d);
			System.out.println(b);
			System.out.println(s);
	}
}