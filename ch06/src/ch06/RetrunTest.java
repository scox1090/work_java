package ch06;

public class RetrunTest {
public static void main(String[] args) {
	RetrunTest r = new RetrunTest();
	
	int result = r.add(3,5);
	System.out.println(result);
	
	int[] result2 = {0};		//�迭�� �����ϰ� result2[0]�� ���� 0���� �ʱ�ȭ
	r.add(3,5,result2);			//�迭�� add�޼����� �Ű������� ����
	System.out.println(result2[0]);
}

int add(int a , int b) {
	return a+b;
}

void add(int a, int b, int[] result) {
	result[0] = a+ b;		//�ŰԺ����� �Ѱܹ��� �迭�� �������� ����
}
}
