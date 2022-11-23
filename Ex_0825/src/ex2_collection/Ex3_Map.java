package ex2_collection;

import java.util.HashMap;

public class Ex3_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		//알고 있으면 도움이 되는 메서드
		if(map.containsKey("k3")) {
			System.out.println("k3라는 key가 존재합니다.");
		}
		if(map.containsValue(3.14f)) {
			System.out.println("map은 3.14값을 가지고 있습니다.");
		}
		
		//3.14값을 출력해보자
		float res = map.get("k2");
		System.out.println("결과 : " + res);
	}
}
