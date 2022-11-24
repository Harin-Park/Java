package ex2_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_Map {
	public static void main(String[] args) {
		//hashmap을 하나 만들어서 키값에는 id, value에는 pw를 저장할 것이다
		//로그인 기능 구현하기
		
		/* 출력예시
		 * id : aaaa
		 * pw : 1111
		 * 아이디가 존재하지 않습니다.
		 * 
		 * id : lee
		 * pw : 3333
		 * 비밀번호 불일치
		 * 
		 * id : park
		 * pw : 3333
		 * 로그인 성공
		 * */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		int pw = sc.nextInt();
		
		if(!map.containsKey(id)) {
			System.out.println("아이디가 존재하지 않습니다.");
		}else {
			if(map.get(id) != pw) {
				System.out.println("비밀번호 불일치");
			}else {
				System.out.println("로그인 성공");
			}
		}
	}
}
