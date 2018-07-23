package test03;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MapTest {

	public static void main(String[] args) {
		LinkedHashMap<String, String> personInfo = new LinkedHashMap<String, String>();
		personInfo.put("이름", "홍길동");
		personInfo.put("나이", "23");
		personInfo.put("주소", "서울");
		
		System.out.println(personInfo);
		
		String age = personInfo.get("나이");
		System.out.println("personInfo의 나이 : " + age);
		
		ArrayList<LinkedHashMap<String, String>> al = new ArrayList<LinkedHashMap<String, String>>();
		al.add(personInfo);
	}
}

//index(배열의 각 자리)는 값이 들어가는 자리를 생성하지만 각 자리가 무엇을 하는지 확신할 수 없다는 단점이 있다.

/*
 * HashMap
 * 
 * 	1.변수명.put(방의 이름, 방의 값)의 방식
 * 	2.대신 방의 순서가 정해져 있지 않음
 * 	3.순서를 확정시키기 위해서 LinkedHasMap을 사용할 수 있음
 * 
 * 	1.
*/