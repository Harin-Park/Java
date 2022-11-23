package ex2_abstract;

public class AbsMain {
	public static void main(String[] args) {
		//추상클래스는 객체(인스턴스)를 직접 가질 수 없다
		//즉, 객체화 시킬 수 없다는 것
		//AbsParent ap = new AbsParent();
		
		AbsChild a1 = new AbsChild();
		
		//추상메서드를 상속받아서 완성시킨 메서드도 가져다 사용할 수 있다
		a1.setValue(20);
		
		//상속관계이기때문에 부모의 메서드를 가져다 사용할 수 있다
		System.out.println(a1.getValue());
		
		//추상클래스는 자신의 기능을 자식이 완성시키도록 조건부 상속을 하여
		//자식클래스가 생성될 때 객체화된다
	}
}
