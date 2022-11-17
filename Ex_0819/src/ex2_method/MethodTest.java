package ex2_method;

public class MethodTest {
	
	public void test1() {
		System.out.println("test1()메서드 호출함");
	}
	
	//메서드명 짓는 규칙
	//첫글자는 소문자로 시작한다
	//valueMethodTest() -> 각 단어의 시작 글자를 대문자로 작성(카멜표기법)
	//value_method_test() -> 단어마다 _를 붙히고 작성(스네이크 표기법)
	
	//public void value(파라미터, 인자, argument, 매개변수)
	public void value(int n) {
		n++;
		System.out.println("value메서드 : " + n);
	}
	
	public String exam(int n1,int n2) {
		System.out.println(n1 + n2);
		//반환형이 void가 아닌 경우에는
		//최소 한개의 return값을 작성해야 한다
		return "안녕"; //반환형과 return타입은 반드시 일치해야 한다
	}
	
	public void value2(int n) {
		n++;
		System.out.println("value2메서드 : " + n);
	}
}
