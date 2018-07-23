package test03;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

public class ListTest02 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			String num = (int) (Math.random() * 30) + 1 + "";
			num = StringUtils.leftPad(num, 2,'0');
			strList.add(num);
		}
		Collections.sort(strList);
		
		for(int i = 0 ; i<10; i++) {
			System.out.println(strList.get(i));
		}
	}
}
// 반복문을 사용하여 1~30까지의 랜덤의 숫자 10개를 strList에 추가하고 출력하라