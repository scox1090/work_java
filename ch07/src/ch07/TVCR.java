package ch07;

class Tv2{
	boolean power;		//전원상태(on/off)
	int channel;		//채널
	
	void power()		{	power = !power;	}
	void channelUp() 	{	++channel;		}
	void channelDown()  {	--channel;		}
}

class VCR{
	boolean power; 			//전원상태(on/off)
	int counter = 0;
	void power()		{	power = !power;}
	void play()	{ /*내용생략*/}
	void stop()	{ /*내용생락*/}
	void rew()	{ /*내용생략*/}
	void ff()	{ /*내용생략*/}
}

class TVCR extends Tv2{
	VCR vcr = new VCR();
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
//	자바는 단일 상속만 가능하다.