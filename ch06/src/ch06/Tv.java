package ch06;

class Tv {
	String color;								//����
	boolean power;							//��������(on/off)
	int channel;								//ä��
	
	void power()		{power = !power;}					//TV�� �Ѱų� ���� ����� �ϴ� �ż���
	void channelUp()	{ ++channel;}						//TV�� ä���� ���̴� ����� �ϴ� �ż���
	void channelDown()	{--channel;}					//TV�� ä���� ���ߴ� ����� �ϴ� �ż���
	}
