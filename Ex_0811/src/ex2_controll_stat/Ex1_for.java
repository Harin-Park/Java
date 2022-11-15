package ex2_controll_stat;

public class Ex1_for {
	public static void main(String[] args) {
		//반복문 : 특정 명령을 원하는만큼 반복하여 실행하는 제어문
		//for(초기식; 조건식; 증감식){
		//		조건식이 참일 때 반복할 명령
		// }
		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(i);	
//		}
		
		//10부터 1까지 감소하는 출력문을 for문을 통하여 작성해보세요.
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
		
		//2단 출력해보기
		int dan = 2;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i)); 
		}
	}
}
