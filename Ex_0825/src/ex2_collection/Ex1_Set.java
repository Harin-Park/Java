package ex2_collection;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
		//컬렉션(collection) : java.util 패키지 안에 있는 인터페이스
		//배열의 단점을 보완하여 index개수가 정해지지 않은 다수의 객체를 다루기 위하여
		//사용하는 프로그래밍 방식
		
		//Set, Map, List
		
		//HashSet<제너릭 타입> : 제너릭 타입 -> 앞으로 Set객체에서 관리하고자 하는
		//자료형의 타입을 미리 지정해두는 구조. 반드시 클래스 형태로만 기입 가능
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("a");
		hs1.add("b");
		hs1.add("c");
		hs1.add("d");
		System.out.println(hs1);
		
		//set에는 중복된 데이터를 추가할 수 없습니다
		hs1.add("a");
		hs1.add("b");
		System.out.println(hs1);
		
		//set에 저장되어있는 데이터를 제거 .remove();
		hs1.remove("a"); //value값을 가지고 제
		System.out.println(hs1);
		
		//set에 있는 모든 데이터를 제거
		hs1.removeAll(hs1);
		System.out.println(hs1);
		
		System.out.println("-------------------------------");
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		while(true) {
			int r = new Random().nextInt(45) + 1;
			hs2.add(r);
			
			//컬렉션은 배열이 아니기 때문에 방의 개수를 세려면 size()라고 하는 메서드를 사용해야 함
			if(hs2.size() == 6) {
				break;
			}
		}
		System.out.println(hs2);
		
		//HashSet은 인덱스 번호가 없어서 요소 하나만 골라서 출력하거나 제거할 수 없습니다
		//new Integer[0] -> 배열의 방 개수를 0으로 잡으면 set이 add해뒀던 방 개수만큼
		//자동으로 배열의 index가 생성된다
		
		//Set -> 배열로 변환
		Integer[] arr = hs2.toArray(new Integer[0]);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
