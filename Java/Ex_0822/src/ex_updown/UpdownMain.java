package ex_updown;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		/*
		 * Updown클래스에서 1~100사이의 난수를 발생시킨다
		 * 메인클래스에서 사용자가 키보드를 통해 정수를 입력받는다
		 * Updown클래스에서 사용자가 입력한 숫자를 판단하여
		 * 발생한 난수보다 크면 down, 작다면 up을 추력
		 * 사용자가 입력한 숫자와 발생한 난수가 같을 경우에 프로그램을 종료시키며
		 * 몇 회만에 정답을 맞혔는지 판단해보자
		 * 
		 * 단, 정답을 맞힌 경우 프로그램의 종료는 updown클래스가 아닌 메인클래스에서 이루어지도록 한다
		 * 
		 * 예시)
		 * 숫자 입력 : 30
		 * down!!
		 * 숫자 입력 : 15
		 * up!!
		 * 숫자 입력 : 25
		 * 3회만에 정답!!
		 * */
		
		Scanner sc = new Scanner(System.in);
		Updown ud = new Updown();
		
		while(true) {
			System.out.print("숫자입력 : ");
			int select = sc.nextInt();
			String res = ud.check(select);
			if(res.equals("정답")) {
				break;
			}
		}
	}
}
