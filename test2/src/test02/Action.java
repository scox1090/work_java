package test02;

public interface Action {
	public void sleep();
	public void run();
	public void walk();
	public void wakeUp();
	public void breakUp();
}

/*
 *interface
 *
 *1.interface에는 생성자를 만들 수 없다.
 *2.interface는 비슷한 행동을 하지만 전혀 다른 클래스를 설정할 때 사용한다.
 *3.interface의 데이터타입들과 class의 데이터타입들이 모두 일치해야한다.
 *4.interface에는 public만 사용가능하다.
 */