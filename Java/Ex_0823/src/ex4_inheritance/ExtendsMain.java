package ex4_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		//Child클래스는 Parent클래스를 상속받는 상태이므로
		//부모로부터 받은 money, str등의 변수를 마음대로 가져다가 사용할 수 있습니다
		
		//부모자식 관계 객체는 자식 객체가 메모리 영역에 할당이 되면 힙 영역에 부모 먼저 만들어진다
		//부모 객체와 자식 객체는 메모리 영역에 주소(인스턴스)를 공유한다
		Child c1 = new Child();
		System.out.println(c1.car);
		System.out.println(c1.getMoney());
		System.out.println(c1.str);
		
		System.out.println("---------------------------");
		//자식은 부모의 재산을 쓸 수 있지만 부모는 자식의 재산에 손을 대는 것이 불가능하다
		Parent p1 = new Parent();
		System.out.println(p1.getMoney());
		System.out.println(p1.str);
//		System.out.println(p1.car);
		
		System.out.println("---------------------------");
		//c1과 p1이 상속관계라면
		//instaceof 키워드를 통해서 true값을 얻을 수 있습니다
		if(c1 instanceof Parent) {
			System.out.println("c1은 Parent의 자식");
		}
		
		//자바의 상속 특징
		//단일 상속 체계
		//1) 한 명의 자녀가 두 명의 부모를 갖는 것은 불가능하다
		//2) 언제든 어떤 상황이 됐든 상속관계의 꼭대기에는 Object가 있다
		//3) Object는 모든 타입을 받아들일 수 있는 최상위 객체이다
	}
}
