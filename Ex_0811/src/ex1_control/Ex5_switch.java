package ex1_control;

public class Ex5_switch {
	public static void main(String[] args) {
		String str = "홍";
		//char -> 1글자만 사용 가능
		//String -> 1글자'도' 사용 가능
		
		//switch문의 비교값을 사용 가능한 자료형
		// 1) 정수(byte, short, int)
		// 2) 문자형(char)
		// 3) 문자열(String)
		
		switch(str) {
			case "박": //break가 없으면 break를 만날 때까지 모든 케이스문을 실행합니다
				System.out.println("박길동입니다.");
				break;
			case "이":
				System.out.println("이길동입니다.");
				break;
			case "김":
				System.out.println("김길동입니다.");
				break;
			case "홍":
				System.out.println("홍길동입니다.");
				break;
			default: //switch문의 비교값과 조건값이 일치하는게 없는 경우 무조건 default로 들어와서 실행을 합니다
				System.out.println("독고 성씨는 없습니다.");
				break;
		}
	}
}
