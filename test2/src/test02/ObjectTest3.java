package test02;

public class ObjectTest3 {
	private int age;
	private String name;
	
	public ObjectTest3(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "�̸� : " + this.name + ", ����: " + this.age;
	}
	
	public static void main(String[] args) {
		//�����ڸ� ����Ͽ� �̸� : ȫ�浿, ���� :22
		//�����ڸ� ����Ͽ� �̸� : �̱浿, ���� :32
		//�����ڸ� ����Ͽ� �̸� : ���浿, ���� :42
		//���� ��°��� �������� �ڵ����ּ���.
		ObjectTest3 str1 = new ObjectTest3(22,"ȫ�浿");
		ObjectTest3 str2 = new ObjectTest3(32,"�̱浿");
		ObjectTest3 str3 = new ObjectTest3(42,"���浿");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
