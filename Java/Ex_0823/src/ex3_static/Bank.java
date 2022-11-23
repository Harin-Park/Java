package ex3_static;

public class Bank {
	//static : 객체가 아무리 많이 생성되어도 메모리상에 딱 한 개만 만들어지는 변수나 메서드
	
	//static 영역에 많이 만들어두면 프로그램을 실행할 때 속도가 느려질 수 있기 때문에
	//꼭 필요한 영역에서만 사용할 것
	
	private String name = "우리은행";
	private String point; //은행위치
	private String tel; //은행전번
	static float interest = 9f; //은행이자
	
	//생성자를 setter처럼 사용
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	//결과를 출력할 메서드
	public void printBank() {
		System.out.println("이름 : " + name);
		System.out.println("위치 : " + point);
		System.out.println("전화번호 : " + tel);
		System.out.println("이자율 : " + interest + "%");
		System.out.println("-------------------------");
	}
}
