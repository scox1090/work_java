package ch06;

class Document{
	static int count = 0;
	String name; 			//������(Document name)
	
	Document(){				//���� ���� �� �������� �������� �ʾ��� ��
		this("�������" + ++count);
	}
	
	Document(String name){			//parameter �Ѱ��� �Է¹޴� ������
		this.name = name;
		System.out.println("���� " + this.name + "(��)�� �����Ǿ����ϴ�.");
	}
}

public class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();			//parameter�� ���� �ʴ� ������ ȣ��
		Document d2 = new Document("�ڹ�.txt");	//parameter �Ѱ��� �޴� ������ ȣ��
		Document d3 = new Document();			//parameter�� ���� �ʴ� ������ ȣ��
		Document d4 = new Document();			//parameter�� ���� �ʴ� ������ ȣ��

	}
}
