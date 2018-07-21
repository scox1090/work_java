package test02;

public class ObjectTest1 {
	public int a;
	public ObjectTest1(int a) {
		this.a = a;
	}
	
	public boolean test(ObjectTest1 ot) {
		return this.a == ot.a;
	}
	public static void main(String[] args) {
		ObjectTest1 ot1 = new ObjectTest1(2);
		ObjectTest1 ot2 = new ObjectTest1(2);
		System.out.println(ot1.test(ot2));
		
		String str1 = "1";
		String str2 = new String("1");
		System.out.println(str1.equals(str2));
	}
}

// 생성자 앞에 final을 쓰면 상속이 되지 않게할 수 있다.