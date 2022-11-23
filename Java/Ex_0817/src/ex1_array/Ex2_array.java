package ex1_array;

public class Ex2_array {
	public static void main(String[] args) {
		char[] cArr = new char[5];
		cArr[0] = 'J';
		cArr[1] = 'A';
		cArr[2] = 'V';
		cArr[3] = 'A';
		cArr[4] = '!';
		//cArr[5] = '!';	내가 만든 배열의 방 개수보다 많은 데이터를 넣으려고 하면 오류가 납니다
		String[] str = new String[3];
		str[0] = "hello";
		
//		char[] cArr = {'J','A','V','A','!'};
		
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		System.out.println();
		System.out.println("---------------------------------");
		//개선된 for문
		//편리하지만 배열의 각 요소에 대한 값의 수정과 삭제가 불가능
		for(char i : cArr) {
			System.out.print(i);
		}
		
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println(cArr); //문자형은 배열명을 가지고 출력이 가능하다
		System.out.println(str[0]); //문자열 배열은 index번호를 명시해줘야 한다
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}
		
		System.out.println("---------------------------------");
		String[]sArr = {"1111","2222","3333","4444","5555"};
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}
}
