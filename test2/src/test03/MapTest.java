package test03;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MapTest {

	public static void main(String[] args) {
		LinkedHashMap<String, String> personInfo = new LinkedHashMap<String, String>();
		personInfo.put("�̸�", "ȫ�浿");
		personInfo.put("����", "23");
		personInfo.put("�ּ�", "����");
		
		System.out.println(personInfo);
		
		String age = personInfo.get("����");
		System.out.println("personInfo�� ���� : " + age);
		
		ArrayList<LinkedHashMap<String, String>> al = new ArrayList<LinkedHashMap<String, String>>();
		al.add(personInfo);
	}
}

//index(�迭�� �� �ڸ�)�� ���� ���� �ڸ��� ���������� �� �ڸ��� ������ �ϴ��� Ȯ���� �� ���ٴ� ������ �ִ�.

/*
 * HashMap
 * 
 * 	1.������.put(���� �̸�, ���� ��)�� ���
 * 	2.��� ���� ������ ������ ���� ����
 * 	3.������ Ȯ����Ű�� ���ؼ� LinkedHasMap�� ����� �� ����
 * 
 * 	1.
*/