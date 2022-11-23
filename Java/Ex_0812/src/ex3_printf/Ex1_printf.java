package ex3_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 7;
		
		System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
		
		//printf : f가 foramt이라는 뜻
		//형식지정자
		// 1) %d : 정수형 변수를 입력받을 때 사용
		// 2) %c : 문자형 변수를 입력받을 때 사용
		// 3) %s : 문자열 변수를 입력받을 때 사용
		// 4) %f : 실수형 변수를 입력받을 때 사용
		
		System.out.printf("%d + %d = %d\n",su1,su2,(su1+su2));
		
		int age = 20;
		//저의 나이는 20세입니다.
		System.out.printf("저의 나이는 %d세 입니다.\n",age);
		
		float height = 170.5f;
		//저의 나이는 20세이고 키는 170.5입니다.
		System.out.printf("저의 나이는 %d세이고 키는 %.1f입니다.\n",age,height);
		
		//저의 혈액형은 AB형입니다.
		System.out.printf("저의 혈액형은 %s입니다.\n","AB");
		
		//원주율은 3.14입니다.
		System.out.printf("원주율은 %.2f입니다.\n", 3.141592);
		
		// 01 02 03 04
		// 05 06 07 08
		// 09 10 11 12
		
		int count = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%02d ", count++);
			}//inner
			System.out.println();
		}//outer
	}
}
