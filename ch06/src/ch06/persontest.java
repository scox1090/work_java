/*package ch06;

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
		
		for(int i = 0 ; i < p.length;i++)
			p[i].introduce();
	}	
}*/

package ch06;

import java.util.Scanner;

public class persontest {
	public static void main(String[] args) {
		person p1 = new person("�ѽ¿�",19,"�ɰ");
		person p2 = new person("�ڻ��",19,"��õ��");
		person p3 = new person("������",19,"��⵵");
		
		 /* [2-2] �Ʒ� ����� ��ü�� ���� �� �� �ν��Ͻ� ������ �����Ͽ�
		 * ���� �ʱ�ȭ �� �κ��̴�.
		 * �Ʒ� �κ��� 2-1���� �ۼ��� �����ڸ� �̿��Ͽ� �����Ͻÿ�.
		 */
		
		
			p1.introduce();
			p2.introduce();
			p3.introduce();
			
			//[2-4]2-3���� ������ �����ڸ� �̿��Ͽ� "ȫ��"�̶�� �̸����� ��� ��ü�� �ϳ��� �����ϼ���.
			//person p = new person("ȫ��");
//			[2-5] 2-4 ��ü�� �̿��Ͽ� introduce()�޼��带 ȣ���ϼ���.
	}
}
