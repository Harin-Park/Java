package ex1_control;

public class Ex7_switch {
	public static void main(String[] args) {
		//두 개의 정수형 변수를 만들고
		//연산자(+ - * /)를 문자열 변수로 만들고 switch문으로 정수를 연산하는 코드를 작성해보세요
		int a = 10;
		int b = 3;
		String op = "-";
		
		switch(op) {
			case "+":
				System.out.println(a + " + " + b + " = " + (a+b) +"입니다.");
				break;
			case "-":
				System.out.println(a + " - " + b + " = " + (a-b) +"입니다.");
				break;
			case "*":
				System.out.println(a + " * " + b + " = " + (a*b) +"입니다.");
				break;
			case "/":
				System.out.println(a + " / " + b + " = " + (a/b) +"입니다.");
				break;
		}
		
	}
}
