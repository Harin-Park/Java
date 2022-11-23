package ex2_abstract;

abstract public class AbsParent {
	//추상메서드가 한 개 이상 정의되어 있는 클래스를 추상클래스라고 합니다
	//추상메서드를 가지고 있는 클래스는 abstract키워드를 붙혀서 추상클래스로 정의해야 합니다
	
	private int value = 100;
	
	public int getValue() {
		return value;
	}
	
	//추상메서드 : body( {} )가 없다
	//추상메서드는 body가 없기 때문에 이를 "미완성적 개념"이라고 합니다
	abstract public void setValue(int n);
//	public abstract void setValue(int n);
	
	//이 미완성적 개념을 자식이 물려받아 완성시켜야 하는 것이 조건이 됩니다
	
}
