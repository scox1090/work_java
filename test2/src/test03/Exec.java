package test03;

import java.util.ArrayList;

public class Exec {

	public static void main(String[] args) {
		// �̸� �׽�Ʈ1~�׽�Ʈ5
		// ���̴� 10~50(10����)
		// ����Ʈ�� �����

		ArrayList<Person> pList = new ArrayList<Person>();
		for (int i = 0; i < 5; i++) {
			Person p = new Person();
			p.setName("�׽�Ʈ" + (i + 1));
			p.setAge((i + 1) * 10);
			p.setPoint((int) (Math.random() * 100) + 1);
			pList.add(p);
		}
		for (int i = 0; i < 5; i++) {
			Person p = pList.get(i);
			System.out.println(p.getName() + "," + p.getAge() + "," + p.getPoint());
		}

		// ArrayList<Person> pList= new ArrayList<Person>();
		// Person p = new Person(); //0�� Person
		// pList.add(p);
		// p.setName("ȫ�浿"); //0���� ����
		// p = new Person(); //1�� Person
		// p.setName("�ٺ�"); //1���� ����
		// System.out.println(p.getName()); //������ Person ���
		// System.out.println(pList.get(0).getName()); //0�� Person�� ���
	}
}
