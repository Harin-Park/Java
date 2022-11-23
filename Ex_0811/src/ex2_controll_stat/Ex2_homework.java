package ex2_controll_stat;

public class Ex2_homework {
	public static void main(String[] args) {
		//1) 1~10까지 반복하는 문장에서 3의 배수만 출력하는 코드를 작성해보세요.
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.println(i+"는 3의 배수입니다.");
			}
		}
		
		//2) 1~20까지 홀수만 출력해보세요.

		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 1) { // i % 2 != 0
				System.out.println(i+"는 홀수입니다.");
			}
		}
	}
}
