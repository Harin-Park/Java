package ex1_super;

public class Child extends Parent{
	
	//super : 부모의 클래스
	public Child() {
		super(10); //따로 명시해주지 않는다면 super()는 생략이 되어있는 상태 Parent()
		//부모의 생성자에서 파라미터를 받는다면 자식클래스에서 super()를 쓸 때 소괄호 안에 데이터를 넣어줘야 한다
		//부모생성자에서 파라미터를 받을 때 자식클래스에서 super()는 생략 불가능!
		System.out.println("자식(child)클래스");
		//super(); 부모생성자를 나중에 호출하려고 하면 오류가 난다
	}
	
	@Override
	public int result() {
		return 200; //Parent.result();
		
		//오버라이드를 했는데 지금 당장 return해줘야 하는 값을 정하지 못 했다면
		//일단 오류가 나지 않게 부모클래스에서의 메서드의 return값을 도출해라
	}
}
