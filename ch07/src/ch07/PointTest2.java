package ch07;

public class PointTest2 {
	public static void main(String[] args) {
		Point302 p3 = new Point302();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);

	}
}

class Point3{
	int x = 10;
	int y = 20;
	
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point302 extends Point3{
	int z = 30;
	
	Point302(){
		this(100,200,300);
	}
	
	Point302(int x , int y, int z){
		super(x,y);
		this.z =z;
	}
}