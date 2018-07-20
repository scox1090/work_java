package ch06PracticeTest;

public class N6_3 {
	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}

class Student {
	String name; // 이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	int sum;	//합계
	float avg;	//평균
	
	Student(String name, int ban, int no,
			int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = (int)((sum/3f)*10f+0.5)/10f;
	}
	
	String info() {
		return name +","+ ban +","+ no +","+ kor+","+eng+","+math+","+sum+","+avg;
	}
}