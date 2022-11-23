package ex6_interface;

public interface InterTest {
	//인터페이스에서는 상수, 추상메서드 이외에는 아무것도 들어갈 수 없습니다
	
	final int NUM = 100; //상수는 자료형 앞에 final을 붙히고 상수명은 항상 대문자로 작성한다
	
	abstract public int getA();
	
	//인터페이스에서는 어차피 상수와 추상메서드만 들어오는걸 알기 때문에 abstract를 붙히지 않아도 오류가 나지 않는다
	
	
}
