package ex1_control_stat;

import java.util.Random;

public class Ex3_do_while {
	public static void main(String[] args) {
		/*
		 * java, jsp, android의 시험을 봤다.
		 * 각 점수는 랜덤하게 0~130점 대입
		 * 각 점수를 검사하는 로직은 do-while로 작성을 하는데
		 * 0~100이 아닐 경우 반드시 0~100 사이가 나오도록 재실행할 것
		 * 
		 * 이렇게 세과목의 점수가 모두 0~100사이가 되면 do-while문을 빠져나와
		 * 점수가 화면에 출력되도록 하는 코드를 작성해보세요
		 * 
		 * 출력결과
		 * 자바 : 70점
		 * jsp : 80점
		 * 안드로이드 : 100점
		 * */
		int java = 0, jsp = 0, android = 0;
		
		do {
			java = new Random().nextInt(131); //0~130의 난수 발생
			jsp = new Random().nextInt(131); //0~130의 난수 발생
			android = new Random().nextInt(131); //0~130의 난수 발생
		}while(java > 100 || jsp > 100 || android > 100);
		
		System.out.println("자바 : " + java);
		System.out.println("jsp : " + jsp);
		System.out.println("안드로이드 : " + android);
	}
}
