package ch06;

import java.util.Scanner;

public class persontest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.��� 3��(��ü 3��) �����
		person[] p = new person[3];
		// 2. �� ��� (��ü)���� �̸� , ���� �ּҸ� �����ϼ���.
		// (�ڱ� �ڽ� �����ؼ� ����� ���� �ۼ��ϱ�)
		// 3. Person Ŭ�������� ���� �޼��带 �� ��� (��ü)���� ȣ���ϼ���.
		// for���� �̿��ص� ���� ���� 3�ٷ� ȣ���ص� �˴ϴ�.
		for(int i=0; i < p.length ; i++) {
			p[i] = new person();
			System.out.print("�̸� :");
			p[i].name = sc.nextLine();
			System.out.print("���� :");
			p[i].years = Integer.parseInt(sc.nextLine());
			System.out.print("�ּ� :");
			p[i].address = sc.nextLine();
		}
		
		for(int i=0; i < p.length ; i++) {
			p[i].introduce();
		}
	}	
}
