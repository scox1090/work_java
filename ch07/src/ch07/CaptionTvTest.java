package ch07;

class Tv {			//조상 클래스(부모 클래스)
	boolean power;	//전원상태(on/off)
	int channel;
	
	void power()			{power = !power;}
	void channelUp()		{++channel;		}
	void channelDown()		{--channel;		}
}

//자손 클래스(자식 클래스)
class CaptionTv extends Tv {	//(상속받을 생성자 extends 상속할 생성자)extends는 상속 시키는 명령
	boolean caption;		//캡션상태(on/off)
	void displayCaption(String text) {
		if(caption)	{		//캡션상태가 on(true)일 때만 text를 보여 준다.
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
