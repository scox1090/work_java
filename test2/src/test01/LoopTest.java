package test01;

public class LoopTest {
	int a=0; 			//Ŭ���� ���ο����� ���� ���� �ۿ� �� �� ����.
						//�������� �� �޼��� �ȿ����� ��� �����ϴ�.
	public static void main(String[] args) {
		for(int i=2;i<=10;i++) {
			//Ȧ�� �϶� Ȧ�� ���
			//¦�� �϶� ¦�� ���
			if(i%2==0) {
				System.out.println("¦��");
			}else if(i%2==0) {
				System.out.println("¦��2");				
			}else {
				System.out.println("Ȧ��");
			}
		}
		
		
		
		
		
		
		
		/*for(int i=1;i<=10;i++) {
			System.out.println("1");	
			if(i%2==0) {
				int t = 10;			//{}�ȿ� �ִ� ������ �� �ȿ��� ����� ������ ����� �� ����.
			}
			System.out.println(t);
		}
		
		int[] arr = new int[4];		
		for(int a : arr) {			//������ �ִ� �迭 ��ŭ ���
			System.out.println(a);
		}*/
	}
}
