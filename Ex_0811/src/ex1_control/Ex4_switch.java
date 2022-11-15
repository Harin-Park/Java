package ex1_control;

public class Ex4_switch {
	public static void main(String[] args) {
		//비교값에 문자가 들어가는 경우
		char c = 'A';
		
		switch(c) {
			case 'A':
				System.out.println("당신의 점수는 90~100점입니다.");
				break;
			case 'B':
				System.out.println("당신의 점수는 80~89점입니다.");
				break;
			case 'C':
				System.out.println("당신의 점수는 70~79점입니다.");
				break;
			case 'D':
				System.out.println("당신의 점수는 60~69점입니다.");
				break;
			case 'F':
				System.out.println("당신의 점수는 59점 이하입니다.");
				break;
		}
	}
}
