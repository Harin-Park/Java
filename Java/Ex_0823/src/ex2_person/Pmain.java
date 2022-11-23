package ex2_person;

public class Pmain {
	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.name = "홍길동";
//		p1.age = 30;
//		p1.tel = "010-1111-1111";
//		
//		System.out.println("이름 : " + p1.name);
//		System.out.println("나이 : " + p1.age);
//		System.out.println("전화번호 : " + p1.tel);
//		
//		System.out.println("--------------------");
//		
//		Person p2 = new Person(); //내가 까먹고 필요한 정보를 입력을 못 할 수도 있다
//		p2.name = "정지훈";
//		p2.age = 23;
//		
//		System.out.println("이름 : " + p2.name);
//		System.out.println("나이 : " + p2.age);
//		System.out.println("전화번호 : " + p2.tel);
		
		Person p1 = new Person(30, "홍길동", "010-1111-1111"); //필요한 정보를 하나라도 빼먹으면 객체 생성이 안 된다
		System.out.println("이름 : " + p1.name);
		System.out.println("나이 : " + p1.age);
		System.out.println("전화번호 : " + p1.tel);
		System.out.println("-------------------");
		
		Person p2 = new Person();
		System.out.println("이름 : " + p2.name);
		System.out.println("나이 : " + p2.age);
		System.out.println("전화번호 : " + p2.tel);
		System.out.println("-------------------");
		
		Person p3 = new Person();
		System.out.println("이름 : " + p3.name);
		System.out.println("나이 : " + p3.age);
		System.out.println("전화번호 : " + p3.tel);
	}
}
