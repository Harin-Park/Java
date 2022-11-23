package ex1_this;

public class Person {
	private int age;
	private String name;
	
	//메서드에서는 지역변수가 우선이라 구분을 할 수 있게 this를 써야 합니다.
	public void setAge(int age) {
		//this : 현재 클래스
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = name;
	}
	
	public String getName() {
		return name;
	}
}
