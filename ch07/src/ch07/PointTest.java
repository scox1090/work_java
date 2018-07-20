package ch07;

class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
		String result = p3.getLocation();
		System.out.println(result);
	}
}

class Point2{
	int x,y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Point2(){}
	
	String getLocation() {
		return "x :" + x + ", y" + y;
		
	}
}

class Point3D extends Point2{
	int z;
	
	Point3D(int x , int y , int z){
		super(x,y);		//�θ��� �⺻������ ȣ��(��������� �ۼ����� ������ �ڵ����� �����Ϸ�
		this.z = z;
	}
	
	String getLocation() {
		return "x :" + x  + ",y :" + y + ",z : " + z;
	}
}
