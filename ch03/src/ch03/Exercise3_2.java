package ch03;

public class Exercise3_2 {
	public static void main(String[] args) {
		int numOfApples = 120; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = (numOfApples % sizeOfBucket > 0 ? numOfApples / sizeOfBucket + 1 : numOfApples / sizeOfBucket); // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
		}
}