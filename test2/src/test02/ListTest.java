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
		str = str.substring(0,str.length()-1);		//���ڸ� �����ϴµ� (������ ù���� ����, ������ ������ ����);
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
		ArrayList<Object> al = new ArrayList();	//ArratList<(Object, String �� ������������ ������ Ÿ���� ����־� �� ������ Ÿ�Ը����� ������ �� ����>
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
		
		System.out.println(al.get(0)==al.get(1));	//new�� ���� ����� ���� �ƴϱ� ������ �Ȱ��� "abc"�� true�� ��µȴ�.
	}
}

/*
 * List, get, set
 * 
 */
	}
}