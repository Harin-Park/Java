package Ex1_TryCatch;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		//자바에서 프로그램이 실행되는 도중 예외(오류,에러,버그)가 발생하면 그 시점에서
		//프로그램이 강제로 종료된다. 종료가 되는게 맞는 판단이지만 때로는 예상 가능한 오류가 있거나
		//오류 발생 시에 이를 무시하고 이후의 작업을 진행해야 하는 경우가 많다
		//예외처리를 통해서 프로그램의 비정상적인 종료를 줄여보자
			
		int result = 0;
		char[] arr = new char[3];
		
		try {
			arr[2] = 'A';
			result = 10 / 0;
			
		}catch(Exception e) { //Exception : 자바에서 발생할 수 있는 모든 예외에 대한 정보를 갖고 있는 클래
			e.printStackTrace(); //어떤 오류가 발생했는지 조금 더 자세하게 알려줌
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println(result);
	}
}
