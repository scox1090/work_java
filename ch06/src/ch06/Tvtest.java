package ch06;

public class Tvtest {
	public static void main(String[] args) {
		Tv t;													//Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv();										//Tv�ν��Ͻ��� �����Ѵ�.
		t.channel = 7;										//Tv�ν��Ͻ��� �ɹ����� channel�� ���� 7�� �Ѵ�.
		t.channelDown();									//Tv�ν��Ͻ��� �ż��� channelDown();�� ȣ���Ѵ�.
		System.out.println("���� ä���� "  +  t.channel + " �Դϴ�.");
	}
}
