package ex1_control;

public class Ex1_if {
	public static void main(String[] args) {
		//제어문(control statment) : 프로그램의 흐름을 제어하는 문법
		//분기문과 반복문
		//분기문 : if, switch
		//반복문 : for, while
		
		//if문
		/*
		 * if(조건식){ 조건식 : 참인지 거짓인지 판별하는 문장 비교연산자
		 * 		조건식이 참일 때 실행할 명령
		 * } 
		 * */
		
		int n = 50;
		String str = null; //String이 기본 자료형은 아니다. 문자열을 저장하는 자료형
		//null : 어떠한 값으로도 초기화되지 않은 상태, 내가 컴파일러(jvm)에게 알려주는 정도.
		//null, ""
		
//		if(n < 30) {
//			str = "50은 30보다 큰 수입니다.";
//			System.out.println(str);
//		}
//		if(n > 40) {
//			str = "50은 40보다 큰 수입니다.";
//			System.out.println(str);
//		}
//		System.out.println("if문의 조건이 거짓입니다.");
		
		//if - else
		/*
		 * if(조건식){
		 * 		조건식이 참일 때 실행할 명령
		 * } else{
		 * 		조건식이 거짓일 때 실행할 명령
		 * }
		 * */
		
//		if(n >= 60) {
//			str = "n은 60 이상의 수";
//		}else {
//			str = "n은 60보다 작습니다.";
//		}
//		System.out.println(str);
		
		//변수 age에 나이를 대입하고 30세 이상이면 "저의 나이는 30세 이상입니다."
		//그렇지 않으면 "저의 나이는 30세 미만입니다."
		//를 출력하는 if문을 구현한 후 마지막으로 "감사합니다"라는 문장을 출력해보세요.
		
//		int age = 25;
//		if(age >= 30) {
//			System.out.println("저의 나이는 30세 이상입니다.");
//		}else {
//			System.out.println("저의 나이는 30세 미만입니다.");
//		}
//		System.out.println("감사합니다");
		
		//삼항연산자로 위 코드 수정해보기
		int age = 25;
		str = age >= 30 ? "저의 나이는 30세 이상입니다." : "저의 나이는 30세 미만입니다.";
		System.out.println(str);
	
	}
	
}
