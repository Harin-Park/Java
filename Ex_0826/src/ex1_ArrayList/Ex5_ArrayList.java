package ex1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5_ArrayList {
	public static void main(String[] args) {
		/*아이디는 키보드에서 입력을 받는다
		 * arrayList생성
		 * 
		 * 결과
		 * 아이디 생성 : abc
		 * abc
		 * 
		 * 아이디 생성 : abc2
		 * abc abc2
		 * 
		 * 아이디 생성 : abc3
		 * abc abc2 abc3
		 * 
		 * 2. 중복되는 아이디를 검사하는 로직 추가하기
		 * */
		
		ArrayList<String> list = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		out : while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			//아이디 중복체크
			for(int i = 0; i < list.size(); i++) {
				if(id.equals(list.get(i))) {
					System.out.println("중복된 아이디");
					continue out;
				}
			}
			list.add(id);
			System.out.println(list);
		}
	}
}
