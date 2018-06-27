package ch06;

class Tv {
	String color;								//색상
	boolean power;							//전원상태(on/off)
	int channel;								//채널
	
	void power()		{power = !power;}					//TV를 켜거나 끄는 기능을 하는 매서드
	void channelUp()	{ ++channel;}						//TV의 채널을 높이는 기능을 하는 매서드
	void channelDown()	{--channel;}					//TV의 채널을 낮추는 기능을 하는 매서드
	}
