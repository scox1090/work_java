package ch07;

class Tv {			//���� Ŭ����(�θ� Ŭ����)
	boolean power;	//��������(on/off)
	int channel;
	
	void power()			{power = !power;}
	void channelUp()		{++channel;		}
	void channelDown()		{--channel;		}
}

//�ڼ� Ŭ����(�ڽ� Ŭ����)
class CaptionTv extends Tv {	//(��ӹ��� ������ extends ����� ������)extends�� ��� ��Ű�� ���
	boolean caption;		//ĸ�ǻ���(on/off)
	void displayCaption(String text) {
		if(caption)	{		//ĸ�ǻ��°� on(true)�� ���� text�� ���� �ش�.
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel  = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;			
		ctv.displayCaption("Hello, World");
	}
}
