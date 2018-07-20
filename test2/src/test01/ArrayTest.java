package test01;

public class ArrayTest {

	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i=0;i<a.length;i++) {
			double d = Math.random()*10;
			int num = (int)d;
			for(int j=i-1;j>0;j--) {
				if(a[i]==a[j]) {
					j=0;
					i--;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
/*
 * 배열의 조건 1.데이터 타입이 모두 같아야 한다. 2.
 */