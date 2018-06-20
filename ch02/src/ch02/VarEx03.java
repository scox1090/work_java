package ch02;

public class VarEx03 {
	final static int MAX_SPEED = 10; // MAX_SPEED는 상수, 10은 리터럴
	final static int WIDTH = 10; // 삼각형의 밑변
	final static int HEIGHT  = 2; // 삼각형의 높이
	/*
	 * final이 붙은면 앞으로 MAX_SPEED는
	 * 프로그램이 종료될 때까지 10으로 고정
	 */
	
	public static void main(String[] arg) {
		System.out.println(MAX_SPEED); //상수 MAX_SPPED 값을 출력
		
		int TriangleArea = WIDTH * HEIGHT  / 2;
		System.out.println(TriangleArea);
	}
}