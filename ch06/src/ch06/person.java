/*package ch06;

public class person {
	// �Ӽ�(�ν��Ͻ� ����)
	
	 // 1.�̸� 2.���� 3.�ּ�
	 
	
	String name;
	int years;
	 String address;
	 
	 
	 
	
	 // �ൿ (�ż���) 1.�ڱ�Ұ� (����[����]�� [�ּ�]�� ��� [�̸�]�Դϴ�.)
	 
	void introduce() {
		System.out.println("���� " + years + "�� " + address + "�� ��� " + name + "�Դϴ�.");
	}
}*/

package ch06;

public class person {
	// �Ӽ�(�ν��Ͻ� ����)
	
	 // 1.�̸� 2.���� 3.�ּ�
	 
	
	String name;
	int years;
	 String address;
	 
//	 [2-1]������ �ʱ�ȭ �ϴ� �����ڸ� �����Ͻÿ�
	person(	String n, int y, String a){
	  name = n;
	  years = y;
	  address = a;
	}	//parameter�� instance�� �����̸��� ���� �Ϸ��� �������� ������ this�� ���̸� ��
	
//	[2-3] �̸��� �Է¹޴� �����ڸ� �ۼ��Ͻÿ�. (��, ���̿� �ּҰ��� ���� �⺻���� 19,"����" ������ �ʱ�ȭ�ϴ� �����ڸ� �ۼ��Ͻÿ�.
//	��Ʈ. 2-1���� �ۼ��� �����ڸ� �̿��Ͽ� �����ڸ� �ۼ��ϸ� �˴ϴ�.
	 person(String name){
		this(name, 19, "����");				//ȣ���� ������ ù��° �ٿ��� ȣ���ؾ��Ѵ�.
		System.out.println("������ ȣ��!");
	 }
	 
	 
	
	 // �ൿ (�ż���) 1.�ڱ�Ұ� (����[����]�� [�ּ�]�� ��� [�̸�]�Դϴ�.)
	 
	void introduce() {
		System.out.println("���� " + years + "�� " + address + "�� ��� " + name + "�Դϴ�.");
	}
}
