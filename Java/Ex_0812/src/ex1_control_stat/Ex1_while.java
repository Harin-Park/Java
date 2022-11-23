package ex1_control_stat;

public class Ex1_while {
	public static void main(String[] args) {
		//while : 간편한 구성을 가진 반복문(선비교 후처리)
		//while(조건식) {
		//	조건식이 참일 때 실행할 명령
		//}
		
		int num = 1;
		while(num <= 10) {
			System.out.println(num);
			num++; //조건이 거짓으로 바뀔 수 있도록 하는 코드를 작성해주자
		}
		
		//for문과 while의 차이점
		//for문은 내가 반복하고 싶은 횟수를 정확히 알 때
		//while문은 내가 만든 조건에 맞게 반복하고 싶을 때
		
		//for문 무한 반복
//		for(;;) {
//			System.out.println(num);
//		}
		
		//do-while : 선처리 후비교
		//do{
		//	실행할 명령
		//}while(조건식)
		
		int i = 11;
		do {
			System.out.println(i); //조건이 거짓이라도 무조건 한 번은 실행을 한다
			i++;
		}while(i <= 10); //제어문 중에 유일하게 뒤에 세미콜론이 붙는다
	}
}
