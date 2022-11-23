package ex1_constructor;

public class ConTest {
	//생성자 : 객체가 생성될 때 메모리 할당을 위해 호출되는 영역
	
	//생성자의 특징
	//첫글자가 대문자이다(함수는 소문자로 시작한다)
	//반환형이 없다
	//클래스 이름과 완전히 동일하다
	
	//기본 생성자
	public ConTest() {
		System.out.println("기본 생성자 호출");
	}
	
	//파라미터를 받는 생성자
	public ConTest(String name) {
		System.out.println("name이" + name + "으로 초기화 됨");
	}
}
