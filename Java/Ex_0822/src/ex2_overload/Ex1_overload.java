package ex2_overload;

public class Ex1_overload {
	//메서드 오버로드(오버로딩) : 메서드의 '중복정의'라고 하며 하나의 클래스 내에서 같은 이름을 가진 메서드가
	//여러개 정의되는 것
	
	//오버로드라고 하는 것 자체가 메서드에서만 적용이 됩니다
	//**메서드 오버로드의 규칙**
	//1) 메서드 이름이 같아야 한다
	//2) 파라미터의 개수가 다른 경우
	//3) 파라미터의 개수가 같아도 타입이 다른 경우
	//4) 파라미터의 개수가 같아도 순서가 다른 경우
	
	public void result() {
		System.out.println("인자가 없는 메서드");
		return;
		//반환형이 void일 때 return을 쓸 수는 있지만 return에 어떤값도 담을 수 없습니다. 그래서 생략이 가능하다
	}
	
	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	public void result(char n) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	public void result(int a, int b) {
		System.out.println("정수 두 개를 인자로 받는 메서드");
	}
	
	public void result(String n) {
		System.out.println("문자열을 인자로 받는 메서드");
	}
	
	public void result(String n, int a) {
		System.out.println("문자열과 정수를 인자로 받는 메서드");
	}
	
	public void result(int a, String n) {
		System.out.println("정수와 문자열을 인자로 받는 메서드");
	}
}
