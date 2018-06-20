package ch01;

public class VarEx04 {
	public static void main(String[] args) {
				//리터럴의 타입과 접미사
				int octNum = 010;       //8진수 10, 10진수로 8
				int hexNum = 0x10;   //16진수 10, 10진수로 16
				int binNum = 0b10;  // 2진수 10, 10진수로 2 (JDK 1.7 버전부터 사용가능)
			
				long big = 100_000_000_000L;            //long big = 100000000000L;
			    long hex = 0xFFFF_FFFF_FFFF_FFFFL; // long hex = 0xFFFFFFFFFFFFFFFFL;
				
				float pi = 3.14f;               // 접미사 f 대신 F를 사용해도 된다.
				double rate = 1.618d;    // 접미사 d 대신 D를 사용해도 되고, 생략해도 된다.
				// float pi = 3.14;           //에러. float타입 변수에 double타입 리터럴 저장불가
				// double rate = 1.618; // ok. 접미사 d는 생략할 수 있다.
				
				
				//타입의 불일치 
				int i = 'A' ;                             // OK. 문자 'A'(char)의 유니코드 인 65가 변수 i에 저장된다.
				long l = 123;                         //OK. int(123)보다 long타입이 더 범위가 넓다.
				double d = 3.14f;                  //OK. float(3.14f)보다 double타입이 더 범위가 넓다.
				//int i = 0x123456789;           //에러. int(0x123456789) 타입의 범위를 넘는 값 저장
				/*float f = 3.14;                     //에러. float(3.14) 타입보다 double(접미사를 붙이지 않으면 double타입으로 인식)
				 											    타입의 범위가 넓다. -> 수정법 : 리터럴을 3.14f로 바꿈 or float타입을 double타입으로 바꿈
				 */
				byte b = 65;                         //OK. byte(65)타입에 저장 간으한 범위의 int 타입 리터럴
			short s = 0x1234;               //OK. short(0x1234)타입에 저장 가능한 범위의 int타입 리터럴
			
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