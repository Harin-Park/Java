package ex5_animal;

public class Snake extends Animal{
	String sensor = "감각이 발달";
	//int let = 0;
	
	//메서드 오버라이딩 : '메서드의 재정의'의 의미를 가진다
	//상속관계의 객체에서 부모의 메서드를 자식이 가져와 사용하되
	//이름을 그대로 두고 내용만 현재 자식의 클래스의 사정에 맞도록 재정의하는 것
	//오버라이딩 메서드는 내용을 제외하고는 부모의 것과 완전히 동일해야 한다
	
	@Override
	public int getLeg() {
		return 0;
	}
}
