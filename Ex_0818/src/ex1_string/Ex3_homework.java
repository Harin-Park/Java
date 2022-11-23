package ex1_string;

import java.util.Scanner;

public class Ex3_homework {
	public static void main(String[] args) {
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다
		//입력받은 문자열에 소문자a가 몇 개 있는지 판별해서 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 무작위로 입력하세요.");
		String a = sc.next();
		int count = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a의 개수 : " + count);
		
		//회문수구하기
		//회문수란 앞으로 읽어도 거꾸로 읽어도 똑같이 읽히는 숫자를 말합니다
		//예를 들어서 12121과 같은 숫자, 기러기 토마토 인도인 스위스 별똥별..역삼역
		//키보드로 값을 입력받아서 회문수인지 아닌지 판별하는 로직을 구현해보자.
		
		System.out.print("회문수를 판별할 데이터를 입력해주세요 : ");
		String hm = sc.next();
		String str = "";
		
		for(int i = hm.length(); i > 0; i--) {
			str += hm.charAt(i-1);
			}
		if(hm.equals(str)) {
			System.out.println(hm + "는 회문수입니다.");
		}else {
			System.out.println(hm + "는 회문수가 아닙니다.");
		}
		
	}
}
