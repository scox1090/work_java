package ch01;

public class VarEx03 {
	final static int MAX_SPEED = 10; // MAX_SPEED�� ���, 10�� ���ͷ�
	final static int WIDTH = 10; // �ﰢ���� �غ�
	final static int HEIGHT  = 2; // �ﰢ���� ����
	/*
	 * final�� ������ ������ MAX_SPEED��
	 *  final�� ������ ������ MAX_SPEED��
	 */

	public static void main(String[] arg) {
		System.out.println(MAX_SPEED); //��� MAX_SPPED ���� ���
		
		int TriangleArea = WIDTH * HEIGHT  / 2;
		System.out.println(TriangleArea);
	}
}
