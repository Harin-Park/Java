package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		//메서드(기능,함수) : 어떤 명령을 수행하기 위한 명령문들의 집합
		//반복적으로 사용하는 코드를 미리 정의해두고 필요할 때마다 가져다가 사용할 수 있다
		
		String str = "Hong Gil Dong";
		
		//length(); 문자열의 길이를 셀 때 사용하고 그 값은 int형으로 반환합니다
		int idx = str.length();
		System.out.println("str의 길이 : " + idx); //띄어쓰기도 글자수에 포함을 한다
		
		//indexOf(); 괄호 안에 글자를 처음 만나는 위치(index)를 int값으로 받는다
		idx = str.indexOf('o');
		System.out.println("str의 맨 처음 나오는 글자의 위치 : " + idx);
		
		//lastindexOf(); 뒤에서부터 만나는 마지막 문자의 위치, int로 반환
		idx = str.lastIndexOf('o');
		System.out.println("str의 맨 마지막에 나오는 글자의 위치 : " + idx);
		
		//equals(); 문자열끼리 값을 비교할 때 사용, boolean형으로 반환(true, false)
		String exam = "apple";
		if(str.equals(exam)) {
			System.out.println("str과 exam의 값은 같습니다.");
		}else if(exam.equals("apple")) {
			System.out.println("exam은 apple입니다.");
		}
		
		//대소문자를 무시하고 알파벳이 같으면 참
		if(exam.equalsIgnoreCase("Apple")) {
			System.out.println("exam은 apple입니다.");
		}
		
		//trim(); 문자열 앞뒤의 의미없는 공백을 제거
		String id = " abc ";
		System.out.println(id.trim());
		
		//정수형태의 문자열을 실제 정수로 바꿔주는 메서드 -> Integer.parseInt();
		String number = "100"; //문자열 100
		int num = Integer.parseInt(number);
		System.out.printf("%d\n", num);
		
		//숫자를 문자열로 바꾸는 방법
		int num2 = 100;
		String str2 = Integer.toString(num2);
		System.out.println(str2+1);
		
//		//charAt(index); 문자열에서 해당 index에 해당하는 글자를 반환
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == 'o') {
//				System.out.println("o가 있습니다.");
//			}
//		}
		
		char result = str.charAt(2);
		System.out.println(result);
		
		//기본자료형의 wrapper 클래스
		//int -> Integer
		//char -> Character
		//boolean -> Boolean
		//byte -> Byte
		//long -> Long
		//float -> Float
		//double -> Double
	}
}
