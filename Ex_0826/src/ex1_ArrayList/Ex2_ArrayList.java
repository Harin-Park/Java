package ex1_ArrayList;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(100);
		list.add(1,14); //데이터를 추가, index번호가 밀린다
		list.set(2,20); //2번 index의 값을 20으로 변경한다
		list.add(55);
		list.remove(1); //1번 index값을 삭제, index번호가 당겨짐
		
		//리스트 안의 내용 전부 삭제
		//list.removeAll(list);
		list.clear();
		
		System.out.println(list);
	}
}
