package ch05;

public class ArrayEx06 {
	public static void main(String[] args) {
		int[] score = {79, 88,91,33,100,55,95};
		
		int max = score[0];			//배열의 첫 번째 값으로 최대값을 초기화 한다.
		int min = score[0];				//배열의 첫 번째 값으로 최대값을 초기화 한다.
		
		for(int i=1; i<score.length;i++) {		//score[0]은 이미 max와 min에 저장되어 있기 때문에 i가 0부터 시작할 필요가 없다.
			if(score[i] > max)
				max = score[i];
			else if(score[i] < min)
				min = score[i];
		}
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
	}
}
