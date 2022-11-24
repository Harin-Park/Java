package ex1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6_ArrayList {
	public static void main(String[] args) {
		//유저의 아이디와 패스워드를 가지는 UserInfo라는 클래스를 만들고
		//UserInfo 클래스에 변수는 private으로 만들것
		//Main클래스에서 유저의 정보를 ArrayList에 추가하여 출력해보자
		//Main에서 객체 생성시 키보드에서 값을 입력 받을 것
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		out : while(true) {
			Scanner sc = new Scanner(System.in);
			
			UserInfo ui = new UserInfo();
			
			System.out.print("아이디 생성 : ");
			ui.setId(sc.next());
			
			//id 중복체크
			for(int i = 0; i < list.size(); i++) {
				if(ui.getId().equals(list.get(i).getId())) {
					System.out.println("아이디가 중복됩니다.");
					continue out;
				}
					
			}
			
			System.out.print("패스워드 입력 : ");
			ui.setPw(sc.next());
			
			list.add(ui);
			for(int i = 0; i < list.size(); i++) {
				System.out.println("아이디 : " + list.get(i).getId());
				System.out.println("비밀번호 : " + list.get(i).getPw());
			}
		}
	}
}
