package ex1_ArrayList;

import java.util.ArrayList;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		Ex4_ArrayFriend f1 = new Ex4_ArrayFriend();
		f1.name = "홍길동";
		f1.age = 20;
		f1.bt = "AB";
		
		Ex4_ArrayFriend f2 = new Ex4_ArrayFriend();
		f2.name = "이상혁";
		f2.age = 27;
		f2.bt = "A";
		
		ArrayList<Ex4_ArrayFriend> list = new ArrayList<Ex4_ArrayFriend>();
		list.add(f1); //list에 f1객체 추가
		list.add(f2);
		
//		System.out.println(list.get(0).name);
//		System.out.println(list.get(0).age);
//		System.out.println(list.get(0).bt);
//		System.out.println("---------------------------");
//		System.out.println(list.get(1).name);
//		System.out.println(list.get(1).age);
//		System.out.println(list.get(1).bt);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
			System.out.println(list.get(i).age);
			System.out.println(list.get(i).bt);
			System.out.println("---------------------------");
		}
		
		//list.get(0)와 f1객체랑 동일하게 사용을 할 수 있다
	}
}
