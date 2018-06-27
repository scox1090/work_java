package ch06;

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
		
		for(int i=0; i < p.length ; i++) {
			p[i].introduce();
		}
	}	
}
