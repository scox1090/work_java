package test04;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�̸�", "�ѽ¿�");
		map.put("����", "44");
		map.put("�ּ�", "��⵵ ��õ��");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
	}
}
