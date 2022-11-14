package ex1_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		//비교연산자 : 변수의 값을 비교해서 참과 거짓을 판단하는 연산자
		//결과는 반드시 true, false로만 값을 가져온다(반환,return)
		// < > <= >= == !=
		
		int n1 = 10;
		int n2 = 20;
		boolean result; //result 변수 선언
	
		result = n1 < n2;
		System.out.println("boolean result = " + result);
		
		// == : a == b -> 같다는 의미, 수학에서 =와 의미가 동일
		result = n1 == n2;
		System.out.println("boolean result = " + result);
		
		// != : a != b -> a와 b가 같지 않다라는 의미
		result = n1 != n2;
		System.out.println("boolean result = " + result);
	}
}
