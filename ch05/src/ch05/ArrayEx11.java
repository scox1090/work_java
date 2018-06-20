package ch05;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int [10];
		
		for(int i = 0 ; i < numArr.length; i++) {		//배열에 임의의 수 저장
			numArr[i]=(int)(Math.random() * 10);		//0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0 ; i < numArr.length; i++) { 		
			counter[numArr[i]]++;
		}
		
		for(int i = 0 ; i < numArr.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	}
}
/*
 * ex)
 * int numArr = {1,5,2,5,1,2,4}
 *  //numArr의 각 자리에 임의의 수를 넣는 코드
 * int count = new int[10];		//count의 자릿값이 0~9자리까지 생성된다.
 * 
 * for(int i = 0; i<numArr.length;i++){		//numArr의 자리수 만큼 반복
 * count[numArr[i]]++; //numArr[i]값을 불러와서 그 숫자가 해당하는 자릿값에 1씩 증가시킨다.
 * //numArr[0]의 값이 1이니까 count[1]에 숫자 1을 증가시킴 (count[1]은 1)
 * //numArr[1]의 값이 5이니까 count[5]에 숫자 1을 증가시킴 (count[5]은 1)
 * //numArr[2]의 값이 2이니까 count[2]에 숫자 1을 증가시킴 (count[2]은 1)
 * //numArr[3]의 값이 5이니까 count[5]에 숫자 1을 증가시킴 (count[5]은 2)
 * //numArr[4]의 값이 1이니까 count[1]에 숫자 1을 증가시킴 (count[1]은 2)
 * //numArr[5]의 값이 2이니까 count[2]에 숫자 1을 증가시킴 (count[2]은 2)
 * //numArr[6]의 값이 4이니까 count[4]에 숫자 1을 증가시킴 (count[4]은 1)
 * }
 * 이제 i의 값을 0부터 numArr의 자릿수까지 1씩 증가시키면서 numArr[i]를 출력하면 됨 
 */
