package ch05;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int [10];
		
		for(int i = 0 ; i < numArr.length; i++) {		//�迭�� ������ �� ����
			numArr[i]=(int)(Math.random() * 10);		//0~9�� ������ ���� �迭�� ����
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0 ; i < numArr.length; i++) { 		
			counter[numArr[i]]++;
		}
		
		for(int i = 0 ; i < numArr.length; i++) {
			System.out.println(i + "�� ���� : " + counter[i]);
		}
	}
}
/*
 * ex)
 * int numArr = {1,5,2,5,1,2,4}
 *  //numArr�� �� �ڸ��� ������ ���� �ִ� �ڵ�
 * int count = new int[10];		//count�� �ڸ����� 0~9�ڸ����� �����ȴ�.
 * 
 * for(int i = 0; i<numArr.length;i++){		//numArr�� �ڸ��� ��ŭ �ݺ�
 * count[numArr[i]]++; //numArr[i]���� �ҷ��ͼ� �� ���ڰ� �ش��ϴ� �ڸ����� 1�� ������Ų��.
 * //numArr[0]�� ���� 1�̴ϱ� count[1]�� ���� 1�� ������Ŵ (count[1]�� 1)
 * //numArr[1]�� ���� 5�̴ϱ� count[5]�� ���� 1�� ������Ŵ (count[5]�� 1)
 * //numArr[2]�� ���� 2�̴ϱ� count[2]�� ���� 1�� ������Ŵ (count[2]�� 1)
 * //numArr[3]�� ���� 5�̴ϱ� count[5]�� ���� 1�� ������Ŵ (count[5]�� 2)
 * //numArr[4]�� ���� 1�̴ϱ� count[1]�� ���� 1�� ������Ŵ (count[1]�� 2)
 * //numArr[5]�� ���� 2�̴ϱ� count[2]�� ���� 1�� ������Ŵ (count[2]�� 2)
 * //numArr[6]�� ���� 4�̴ϱ� count[4]�� ���� 1�� ������Ŵ (count[4]�� 1)
 * }
 * ���� i�� ���� 0���� numArr�� �ڸ������� 1�� ������Ű�鼭 numArr[i]�� ����ϸ� �� 
 */
