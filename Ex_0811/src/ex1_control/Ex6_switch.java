package ex1_control;

public class Ex6_switch {
	public static void main(String[] args) {
		//정수형 변수를 하나 만들어서 해당 달이 며칠까지 있는지
		//switch문을 이용해서 작성하세요.
		//13이상을 입력하면 1~12사이의 숫자만 입력해주세요라고 출력하기
		
		int month = 12;
		
		switch(month) {
			case 1: case 3: case 5: case 7:
			case 8: case 10: case 12: 
				System.out.println(month +"월은 31일까지 있습니다.");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println(month +"월은 30일까지 있습니다.");
				break;
			case 2:
				System.out.println(month +"월은 28일까지 있습니다");
				break;
			default :
				System.out.println("1~12사이의 숫자만 입력해주세요");
				break;
		}
	}
}
