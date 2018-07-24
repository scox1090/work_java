package test04;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름", "한승우");
		map.put("나이", "44");
		map.put("주소", "경기도 부천시");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
	}
}
