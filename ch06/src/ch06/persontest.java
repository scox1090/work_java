/*package ch06;

import java.util.Scanner;

public class persontest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1.사람 3명(객체 3개) 만들기
		person[] p = new person[3];
		// 2. 각 사람 (객체)마다 이름 , 나이 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		// 3. Person 클래스에서 만든 메서드를 각 사람 (객체)마다 호출하세요.
		// for문을 이용해도 좋고 각각 3줄로 호출해도 됩니다.
		
		for(int i=0; i < p.length ; i++) {
			p[i] = new person();
			System.out.print("이름 :");
			p[i].name = sc.nextLine();
			System.out.print("나이 :");
			p[i].years = Integer.parseInt(sc.nextLine());
			System.out.print("주소 :");
			p[i].address = sc.nextLine();
		}
		
		for(int i = 0 ; i < p.length;i++)
			p[i].introduce();
	}	
}*/

package ch06;

import java.util.Scanner;

public class persontest {
	public static void main(String[] args) {
		person p1 = new person("한승우",19,"심곡동");
		person p2 = new person("박상우",19,"부천시");
		person p3 = new person("서현빈",19,"경기도");
		
		 /* [2-2] 아래 방법은 객체를 생성 후 각 인스턴스 변수에 접근하여
		 * 값을 초기화 한 부분이다.
		 * 아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오.
		 */
		
		
			p1.introduce();
			p2.introduce();
			p3.introduce();
			
			//[2-4]2-3에서 생성한 생성자를 이용하여 "홍민"이라는 이름으로 사람 객체를 하나를 생성하세요.
			//person p = new person("홍민");
//			[2-5] 2-4 객체를 이용하여 introduce()메서드를 호출하세요.
	}
}
