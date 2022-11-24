package ex2_collection;

import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		//Map 구조는 키(key)값과 값(value)이 하나의 데이터로 저장
		//map 구조는 key를 통해서 값을 검색해내므로 많은 양의 데이터를
		//조회하는데 있어서 매우 뛰어난 성능을 발휘
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
		//map에 저장되는 value는 중복될 수 있다
		map.put(4, 'A');
		
		//map의 key값은 중복이 될 수 없다
		map.put(1, 'F'); //기존에 같은 이름을 가진 key가 있다면 value를 갱신한다
		
		//key값을 통해 데이터(value)를 삭제하는 방법
		map.remove(3);
		
		System.out.println("map의 사이즈 : " + map.size());
		System.out.println(map);
		
		char res = map.get(1);
		System.out.println(res);
		
		//map의 특징 -> 키값으로 모든걸 해결한다
		//키값으로 추가하고 조회하고 삭제할 수 있다
		//index값이 없다
	}
}
