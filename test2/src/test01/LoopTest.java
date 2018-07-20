package test01;

public class LoopTest {
	int a=0; 			//클래스 내부에서는 오직 선언 밖엔 할 수 없다.
						//나머지는 다 메서드 안에서만 사용 가능하다.
	public static void main(String[] args) {
		for(int i=2;i<=10;i++) {
			//홀수 일땐 홀수 출력
			//짝수 일땐 짝수 출력
			if(i%2==0) {
				System.out.println("짝수");
			}else if(i%2==0) {
				System.out.println("짝수2");				
			}else {
				System.out.println("홀수");
			}
		}
		
		
		
		
		
		
		
		/*for(int i=1;i<=10;i++) {
			System.out.println("1");	
			if(i%2==0) {
				int t = 10;			//{}안에 있는 영역은 그 안에서 선언된 변수를 사용할 수 없다.
			}
			System.out.println(t);
		}
		
		int[] arr = new int[4];		
		for(int a : arr) {			//가지고 있는 배열 만큼 출력
			System.out.println(a);
		}*/
	}
}
