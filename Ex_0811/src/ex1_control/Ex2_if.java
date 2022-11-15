package ex1_control;

public class Ex2_if {
	public static void main(String[] args) {
		//다중 if(if -else if) : 여러개의 조건 비교가 필요한 경우
		/*
		 * if(조건식){
		 * 		조건식이 참일 때 실행할 명령
		 * }else if(조건식2){
		 * 		조건식1이 거짓이고 조건식2가 참일 때 실행할 명령
		 * }else if(조건식3){
		 * 		조건식1,2가 거짓이고 조건식3이 참일 때 실행할 명령
		 * }else{
		 * 		위의 조건이 모두 거짓일 때 실행할 명령
		 * }
		 * */
		
		 int score = 75;
		 String pga = "";
		 
		 if(score >= 90) {
			 pga = "A";
		 }else if(score >= 80) {
			 pga = "B";
		 }else if(score >= 70) {
			 pga = "C";
		 }else if(score >= 60) {
			 pga = "D";
		 }else { //else는 생략이 가능한 상황이라면 생략이 가능하다
			 pga = "F";
		 }
		 System.out.println("당신의 학점은 : " + pga);
	}
}
