package ex1_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		//삼항연산자 : 하나의 조건을 정의하여 그 조건이 참일 경우 true, 거짓일 경우 false값을 얻어내기 위한 연산자
		// ? :
		
		int a = 10;
		int b = 15;
		boolean result;
		result = ++a >= b ? true : false;
		System.out.println("result = " + result);
		
		int n1 = 10;
		int n2 = 20;
		char result2;
		result2 = (n1 += n2) == n2 ? 'O' : 'X';
		System.out.println("result2 = " + result2);
	}
}
