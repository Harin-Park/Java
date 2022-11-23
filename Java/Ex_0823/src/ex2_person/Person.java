package ex2_person;

public class Person {
	int age;
	String name;
	String tel;
	
	//생성자를 작성하지 않으면 default로 기본 생성자가 사용됩니다
	
	//파라미터를 받는 생성자
	//파라미터를 받는 생성자를 만들었다면 더 이상 기본 생성자는 사용할 수 없습니다
	public Person(int age, String name, String tel) {
		this.age = age;
		this.name = name;
		this.tel = tel;
	}
	
	//하지만 기본 생성자를 명시해준다면 사용할 수 있습니다
	//똑같은 객체를 계속 만드려고 한다면 기본 생성자에 값을 넣어 놓을수 있습니다
	public Person() {
		age = 27;
		name = "이상혁";
		tel = "010-2222-2222";
	}
}
