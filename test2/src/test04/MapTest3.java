package test04;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest3 {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> animalList = new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> animal1 = new HashMap<String,String>();
		animal1.put("�����̸�", "�ھ˶�");
		animal1.put("����", "6");
		animalList.add(animal1);
		
		HashMap<String,String> animal2 = new HashMap<String,String>();
		animal2.put("�����̸�", "�Ҵ�");
		animal2.put("����", "12");
		animalList.add(animal2);
		
		HashMap<String,String> animal3 = new HashMap<String,String>();
		animal3.put("�����̸�", "�����ڱ�");
		animal3.put("����", "4");
		animalList.add(animal3);
		
		HashMap<String,String> animal4 = new HashMap<String,String>();
		animal4.put("�����̸�", "ħ��ġ");
		animal4.put("����", "15");
		animalList.add(animal4);

		for(int i=0;i<animalList.size();i++) {
			System.out.println(animalList.get(i));
		}
	}
}
