package ch06;

public class person {
	// 속성(인스턴스 변수)
	/*
	 * 1.이름 2.나이 3.주소
	 */

	String name;
	int years;
	String address;

	/*
	 * 행동 (매서드) 1.자기소개 (저는[나이]살 [주소]에 사는 [이름]입니다.)
	 */
	void introduce() {
		System.out.println("저는 " + years + "살 " + address + "에 사는 " + name + "입니다.");
	}
}
