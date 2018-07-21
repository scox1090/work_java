package test02;

public class ObjectTest4 {
	private int speed;
	private int power;
	private String heroName;
	
	
	public ObjectTest4(int speed, int power, String heroName){
		this.speed = speed;
		this.power = power;
		this.heroName = heroName;
	}
	
	public String toString() {
		return "내 이름은" + this.heroName + "이며" + this.power+ "정도의 힘과" + this.speed +"정도로 빠르지";
	}
	
	public static void main(String[] args) {
		ObjectTest4[] ot4s = new ObjectTest4[2];
		ot4s[0] = new ObjectTest4(10,10,"홍길동");
		ot4s[1] = new ObjectTest4(20,20,"임꺽정");
		
		for(ObjectTest4 ot4 : ot4s) {
			System.out.println(ot4s);
		}
		
		/*ObjectTest4[] ot4s = new ObjectTest4[2];	//사용자가 만든 생성자도 배열을 만들수 있지만 new를 써도 그 안의 있는 배열 값까지 생성되는 것은 아니다.
		ot4s[0] = new ObjectTest4(10,10,"가갸");
		ot4s[1] = new ObjectTest4(20,20,"나냐");
		String str1 = ot4s[0].toString();
		String str2 = ot4s[1].toString();
		System.out.println(str1);
		System.out.println(str2);*/
	}
}
