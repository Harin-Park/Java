package ex6_homework;

import java.util.Scanner;

public class CalTestMain {
	public static void main(String[] args) {
		/* 첫번째 숫자 입력 : 5
		 * 두번째 숫자 입력 : 10
		 * 연산 기호 입력 : +
		 * 결과 : 15
		 * 
		 * Scanner를 이용해 숫자 두 개와 연산 기호를 받은 뒤 계산해주는 클래스를 만들고 실행해보기
		 * 연산자는 String타입으로 받을 것! */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int n2 = sc.nextInt();
		System.out.print("연산 기호를 입력하세요 : ");
		String s1 = sc.next();
		
		CalTest ct = new CalTest();
		
		ct.cc(n1, n2, s1);
	}
}
		/*
		 * int n1, n2;
		 * String op;
		 * CalTest ct = new CalTest();
		 * 
		 * System.out.print("첫번째 숫자 입력 : ");
		 * n1 = sc.nextInt();
		 * System.out.print("두번째 숫자 입력 : ");
		 * n2 = sc.nextInt();
		 * System.out.print("연산 기호 입력 : ");
		 * op = sc.next();
		 * 
		 * System.out.println("결과 : ");
		 * System.out.println(ct.getResult(n1, n2,op));
		 * 
		 * */
	

