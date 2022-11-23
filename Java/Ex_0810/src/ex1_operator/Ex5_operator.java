package ex1_operator;

public class Ex5_operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		boolean result;
		
		result = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10;
		//11 >= 12 || 9 <= 12 && 1 >= 0 && 23 - 11 > 10;
		//false || true && true && true;
		
		//true
		//답이 true, false
		System.out.println("result = " +result);
		
	} //main()
}
