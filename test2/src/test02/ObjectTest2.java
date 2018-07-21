package test02;

public class ObjectTest2 {
	public int num = 10;
	public String str = "abc";
	
	public ObjectTest2(int num, String str) {
		this.num = num;
		this.str = str;
	}
	
	public String toString() {
		return this.num + "," + this.str;
	}
	
	public static void main(String[] args) {
		ObjectTest2 ot1 = new ObjectTest2(11,"나나");
		System.out.println(ot1);
		ot1 = new ObjectTest2(12,"너너");
		System.out.println(ot1);
		ot1 = new ObjectTest2(13,"하하");
		System.out.println(ot1);
	}
}

//Class이름을 정하는데에는 다른 사용자들도 잘 알아볼 수 있도록 이름을 문자로만 쓰는 것이 좋다.