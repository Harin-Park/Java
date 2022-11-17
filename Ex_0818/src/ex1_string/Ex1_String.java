package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		//String은 두 가지 특징을 가진다
		//1) 객체 생성방법이 2가지(암시적, 명시적)
		//2) 한번 생성된 문자열의 내용은 변하지 않는다(불변적 특징)
		
		String s1 = "abc"; //암시적 객체 생성
		String s2 = "abc";
		//이미 앞에 같은 문자열로 생성된 암시적 객체가 있다면
		//앞서 생성된 객체의 주소를 재사용한다
		
		String s3 = new String("abc"); //명시적 객체 생성
		String s4 = new String("abc");
		
		// ==연산자는 기본자료형을 비교할 때는 '값'을 비교합니다.
		//그러나 객체끼리 비교할 때는 주소를 비교하는 연산자로 기능이 바뀝니다.
		if(s1 == s2) {
			System.out.println("주소가 같습니다.");
		}else {
			System.out.println("주소가 다릅니다.");
		}
		
		System.out.println("----------------------------");
		//주소가 아닌 값을 비교하고 싶을 때는 -> 객체1.equals(객체2)
		if(s3.equals(s4)) {
			System.out.println("값이 같습니다.");
		}else {
			System.out.println("값이 다릅니다.");
		}
		
		System.out.println("----------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String s5 = sc.next();
		
		if(s5.equals(s1)) {
			System.out.println("값이 같습니다.");
		}else {
			System.out.println("값이 같지 않습니다.");
		}
		
		System.out.println("----------------------------");
		//불변의 특징
		String greet = "안녕";
		greet += "하세요"; //greet = greet + "하세요";
		System.out.println(greet);
	}
}
