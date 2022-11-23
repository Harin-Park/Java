package ex1_control;

public class Ex3_switch {
	public static void main(String[] args) {
		/*
		 * switch : 비교값과 조건값을 통해 결과를 출력하는 제어문
		 * switch(비교값){
		 * 		case 조건값 :
		 * 			비교값과 조건값이 일치할 때 실행되는 명령
		 * 			break;
		 * }
		 * */
		//특정한 값을 바로 찾아서 들어가기 때문에 if문에 비해서 처리속도가 빠르다
		//단점 : 범위를 이용해서 찾아야 하는 경우 case를 매우 많이 만들어야 한다
		
		//if문을 사용하는 경우 : 범위를 찾아서 비교해야 할 때(성적 산출)
		//switch문을 사용하는 경우 : 특정값을 한 번에 찾아서 비교할 때
		
		int n = 3;
		switch(n) {
			case 1:
				System.out.println("1.게임소개");
				break;
			case 2:
				System.out.println("2.게임하기");
				break;
			case 3:
				System.out.println("3.게임종료");
				break;
		}
	}
}
