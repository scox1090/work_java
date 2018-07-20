package ch06;

class Data1{
	int value;
	
	/*
	 * �⺻ ������(Default Construnctor)
	 * �����ڸ� �ۼ����� ������ �⺻����
	 * �����Ϸ��� �˾Ƽ� �����ϴ� ������
	 * ���� �Ʒ��� ���� ��������� �ۼ� ��
	 * �ٵ�κ�(�߰�ȣ ��)�� �ڵ带 �ۼ��ϸ�
	 * ������ ȣ�� �� �ڵ尡 ������ �ȴ�.
	 */
	Data1(){
		System.out.println("Data1 ������ ȣ��!");
	}
}

class Data2{
	int value;


/*
 * ������
 * �ν��Ͻ��� ������ �� ȣ��Ǵ� �ν��Ͻ� �ʱ�ȭ �޼����̴�.
 * 
 * 1. �������� �̸��� Ŭ������ �̸��� ���ƾ� �Ѵ�.
 * 2. �����ڴ� ���� ���� ����.
 * 
 * �����ڴ� ��ü�� �����Ǵ� ������
 * �����ϰ� ���� �ڵ带 �ۼ��ϸ� �ȴ�.
 * ��) �ν��Ͻ� ���� ���� ���ϴ� ������ �ʱ�ȭ �� ��
 */
	Data2(int x){	//parameter�� �ִ� ������
		value = x;
		System.out.println("Data2 ������ ȣ��!");
	}
}

class ConstructorTest {	
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(30);	// compil error �߻� 
		
		System.out.println("d1 ��ü�� value:" + d1.value);
		System.out.println("d2 ��ü�� value:" + d2.value);

	}
}
