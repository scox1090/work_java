package test03;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest03 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(5);
		numList.add(3);
		Collections.sort(numList);		//오름차순 정렬
		for(int i=0; i<numList.size();i++) {
			System.out.println(i+1 +"번째 값 : " + numList.get(i)); 
		}
		
		Collections.reverse(numList);	//내림차순 정렬
		for(int i=0; i<numList.size();i++) {
			System.out.println(i+1 +"번째 값 : " + numList.get(i)); 
		}
	}
}
