package ex1_ArrayList;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		//ArrayList : index제한없이 값을 추가하거나 제거하는 용도의 클래스
		//중복된 값을 무시하지 않고 추가
		//index번호를 가지고 있다(가장 중요!)
		
		//배열과 같지만 배열은 크기가 정해져야만 한다
		//int [] ar = new int[10];
		//하지만 List구조는 size가 늘었다가 줄어들었다 유동적이다
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(100);
		list.add(20);
		System.out.println("list의 크기 : " + list.size());
		System.out.println(list);
		
		//20이라는 값만 가져오기
		int res = list.get(2);
		System.out.println(res);
		
		//for문을 사용하여 list가 가진 모든 index로 접근하기
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------");
		
		//개선된 for문
		//배열, list와 같은 순차적 index구조로 자동으로 접근하여 내용을 출력하는 것이 간편해진다
		//단, index로 직접적인 접근이 불가능하기 때문에 특정 index에 대한 수정이나 제어가 불가능하다
		for(int i : list) {
			System.out.println(i);
		}
	}
}
