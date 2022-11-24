package Ex1_TryCatch;

import java.util.Scanner;

public class Ex4_TryCatch {
public static void main(String[] args) {
		
		/*
		 * 결과
		 * 정수 : 100
		 * 결과 : 100
		 * 
		 * 정수 : aaa
		 * 결과 : aaa은(는) 정수가 아닙니다.
		 * */
		
		System.out.println("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		try {
			str = sc.next();
			int num = Integer.parseInt(str); //
			System.out.println("결과 : " + num);
		}catch(Exception e) {
			System.out.println(str+"은(는) 정수가 아닙니다.");
		}
	}
}
