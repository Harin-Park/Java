package ex2_abstract;

public class AbsChild extends AbsParent{

	//추상클래스를 상속받은 자식클래스는
	//부모가 갖고 있는 추상메서드(미완성)를 반드시 받아두어야 합니다
	
	//자식도 재정의할 필요가 없다면 받아만 놔도 상관이 없다
	//하지만 무조건 갖고 있어야 한다
//	@Override
//	public void setValue(int n) {
//	}
	
	@Override
	public void setValue(int n) {
		System.out.println("추상메서드 재정의함");
	}
	
	
}
