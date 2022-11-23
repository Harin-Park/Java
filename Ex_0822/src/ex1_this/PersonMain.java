package ex1_this;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(20);
		System.out.println(p1.getAge());
		
		p1.setName("홍길동");
		System.out.println(p1.getName());
	}
}
