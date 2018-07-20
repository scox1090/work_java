/*package ch06;

public class person {
	// 속성(인스턴스 변수)
	
	 // 1.이름 2.나이 3.주소
	 
	
	String name;
	int years;
	 String address;
	 
	 
	 
	
	 // 행동 (매서드) 1.자기소개 (저는[나이]살 [주소]에 사는 [이름]입니다.)
	 
	void introduce() {
		System.out.println("저는 " + years + "살 " + address + "에 사는 " + name + "입니다.");
	}
}*/

package ch06;

public class person {
	// 속성(인스턴스 변수)
	
	 // 1.이름 2.나이 3.주소
	 
	
	String name;
	int years;
	 String address;
	 
//	 [2-1]변수를 초기화 하는 생성자를 생성하시오
	person(	String n, int y, String a){
	  name = n;
	  years = y;
	  address = a;
	}	//parameter와 instance의 변수이름을 같게 하려면 생성자의 변수에 this를 붙이면 됨
	
//	[2-3] 이름만 입력받는 생성자를 작성하시오. (단, 나이와 주소값은 각각 기본으로 19,"없음" 값으로 초기화하는 생성자를 작성하시오.
//	힌트. 2-1에서 작성한 생성자를 이용하여 생성자를 작성하면 됩니다.
	 person(String name){
		this(name, 19, "없음");				//호출은 무조건 첫번째 줄에서 호츨해야한다.
		System.out.println("생성자 호출!");
	 }
	 
	 
	
	 // 행동 (매서드) 1.자기소개 (저는[나이]살 [주소]에 사는 [이름]입니다.)
	 
	void introduce() {
		System.out.println("저는 " + years + "살 " + address + "에 사는 " + name + "입니다.");
	}
}
