package ex1_class;

public class Computer {
	//컴퓨터 대량 생산을 위한 설계도를 만드는 작업
	//클래스의 구성요소
	//1) 변수(멤버, 속성)
	//2) 함수(메서드, 기능)
	private String brand = "삼성";
	int ssd = 256;
	int ram = 16;
	float cpu = 4.8f;
	String color = "white";
	
	//컴퓨터 정보를 알려주는 메서드를 만들어보자
	//메서드란 어떤 작업을 수행하기 위한 명령문들의 집합
	//반복적으로 사용되는 코드를 줄이기 위해서 반드시 필요한 개념
	
	//접근제한자 반환형 함수명(){}
	public void getInfo() {
		System.out.println("brand : " + brand); //private 변수는 함수를 이용해야만 호출이 가능하다
		System.out.println("ssd : " + ssd + "GB");
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "Ghz");
		System.out.println("color : " + color);
	}
	
	//접근제한자
	//1. public : 모든 접근을 허용. 같은 프로젝트 내의 모든 객체들이 사용할 수 있도록 허용
	//2. private : 현재 클래스 내에서만 사용을 허가
	//3. protected : 상속관계의 객체들에만 사용을 허가
	//4. default : 같은 패키지(폴더)내의 객체에만 사용을 허가
	
	//반환형
	//메서드가 처음부터 끝까지 수행을 마친 후에 반환해야 할 값이 '있을 경우'에 기입
	//반환을 해야 하는 데이터 타입에 따라서 반환형을 설정해줍니다
}
