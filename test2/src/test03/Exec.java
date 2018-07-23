package test03;

import java.util.ArrayList;

public class Exec {

	public static void main(String[] args) {
		// 이름 테스트1~테스트5
		// 나이는 10~50(10단위)
		// 포인트는 맘대로

		ArrayList<Person> pList = new ArrayList<Person>();
		for (int i = 0; i < 5; i++) {
			Person p = new Person();
			p.setName("테스트" + (i + 1));
			p.setAge((i + 1) * 10);
			p.setPoint((int) (Math.random() * 100) + 1);
			pList.add(p);
		}
		for (int i = 0; i < 5; i++) {
			Person p = pList.get(i);
			System.out.println(p.getName() + "," + p.getAge() + "," + p.getPoint());
		}

		// ArrayList<Person> pList= new ArrayList<Person>();
		// Person p = new Person(); //0번 Person
		// pList.add(p);
		// p.setName("홍길동"); //0번에 대입
		// p = new Person(); //1번 Person
		// p.setName("바부"); //1번에 대입
		// System.out.println(p.getName()); //마지막 Person 출력
		// System.out.println(pList.get(0).getName()); //0번 Person을 출력
	}
}
