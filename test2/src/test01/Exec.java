package test01;

public class Exec {
	public static void main(String[] args) {
		Calc c = new Calc();
//		System.out.println(c.add(1, 2));		//private  출력 불가능

		System.out.println(c.minus(1, 2));		//public   출력 가능
		System.out.println(c.multiple(1, 2));	//default  출력 가능

	}
}

/*
 * public
 * private(해당 클래스 내부에서만 사용가능)
 * default
 * protected
 */