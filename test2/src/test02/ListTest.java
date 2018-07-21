package test02;

import java.util.ArrayList;

public class ListTest {
	private String[] strs = new String[0];
	private int size = 0;

	public boolean add(String s) {
		String[] tmps = strs;
		strs = new String[++size];
		for(int i=0;i<tmps.length;i++) {
			strs[i] = tmps[i];
		}
		strs[size-1] = s;
		return true;
	}

	public int size() {
		return size;
	}

	public String get(int idx) {
		return strs[idx];
	}

	public String toString() {
		String str = "[";
		for(String s:strs) {
			str += s+",";
		}
		str = str.substring(0,str.length()-1);		//문자를 저장하는데 (저장할 첫번쨰 문자, 저장할 마지막 문자);
		str += "]";
		return str;
	}
	public int indexOf(String s) {
		for(int i=0; i<strs.length;i++) {
			if(s.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		ListTest lt = new ListTest();
		System.out.println(lt.size());
		lt.add("a");
		lt.add("23");
		lt.add("adfsas");
		lt.add("bv");
		lt.add("aaa");
		System.out.println(lt.size());
		System.out.println(lt);
		System.out.println(lt.indexOf("23"));
		
		
		
		
		
		
		
	
		
		/*Object a = true;
		a = "abc";
		a = 1.1;
		a = 10;
		a = 'c';
		a = new String("abc");
		ArrayList<Object> al = new ArrayList();	//ArratList<(Object, String 등 정해지지않은 데이터 타입을 집어넣어 그 데이터 타입만으로 제하할 수 있음>
		al.add("abc");
		al.add(true);
		al.add(1);
		al.add(3.2);
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		for(String str : al) {
			System.out.println(str);
		}
		for(int i = 0 ; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println(al.get(0)==al.get(1));	//new로 각각 선언된 것이 아니기 때문에 똑같은 "abc"로 true가 출력된다.
	}
}

/*
 * List, get, set
 * 
 */
	}
}