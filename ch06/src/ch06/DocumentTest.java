package ch06;

class Document{
	static int count = 0;
	String name; 			//문서명(Document name)
	
	Document(){				//문서 생성 시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);
	}
	
	Document(String name){			//parameter 한개를 입력받는 생성자
		this.name = name;
		System.out.println("문서 " + this.name + "(이)가 생성되었습니다.");
	}
}

public class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();			//parameter를 받지 않는 생성자 호출
		Document d2 = new Document("자바.txt");	//parameter 한개를 받는 생성자 호출
		Document d3 = new Document();			//parameter를 받지 않는 생성자 호출
		Document d4 = new Document();			//parameter를 받지 않는 생성자 호출

	}
}
