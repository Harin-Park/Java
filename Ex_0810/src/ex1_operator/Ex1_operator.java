package ex1_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		//연산
		//1 + 1 = 2
		/*
		 * 1.최고연산자 : . ()
		 * 2.증감연산자 : ++ --
		 * 3.산술연산자 : + - * / %
		 * 4.시프트연산자 : >> << >>>
		 * 5.비교연산자 : < > <= >= == !=
		 * 6.비트연산자 : & |(bar) ^ ~
		 * 7.논리연산자 : && || !
		 * 8.조건(삼항)연산자 : ? :
		 * 9.대입연산자 : = *= -= /= *=
		 * */
		
		//산술연산자 : 사칙연산과 나머지 연산자를 갖고 있는 연산자
		// + - * / %
		int n1,n2,n3; //정수형 변수 선언
		
		n1 = 20; //n1에 20을 대입
		n2 = 7; //n2에 7을 대입
		n3 = n1 + n2;
		System.out.println("n1 + n2 = " +n3);
		
		n3 = n1 - n2;
		System.out.println("n1 - n2 = " +n3);
		
		n3 = n1 * n2;
		System.out.println("n1 * n2 = " +n3);
		
		n3 = n1 / n2;
		System.out.println("n1 / n2 = " +n3);
		
		n3 = n1 % n2; //짝수,홀수 판별 -> 2로 나눈 나머지가 1이라면 홀수 아니면 짝수
					  //o의 배수를 구할 때 o로 나눈 나머지가 0이면 o의 배수이다
		System.out.println("n1 % n2 = " +n3);
		
		//대입연산자 : 특정값을 변수에 전달하기 위해서 기억시킬 때 사용하는 연산자
		//= += -= *= /= %=
		
		int num = 10;
		int num2 = 7;
		System.out.println("=연산자 : num = " + num +", num2 = "+num2);
		
		//+=
		int num3 = 13;
		int num4 = 14;
		
		//num3 += num4; //num3 = num3 + num4;
		System.out.println("+=연산자 : num3+=num4 "+(num3+=num4));
		
		//-=
		int num5 = 20;
		int num6 = 10;
		
		//num5 -= num6; -> num5 = num5 - num6;
		System.out.println("-=연산자 : num5-=num6 "+(num5-=num6));
		
		//*=
		int num7 = 5;
		int num8 = 8;
		
		//num7 *= num8; -> num7 = num7 * num8;
		System.out.println("*=연산자 : num7*=num8 "+(num7*=num8));
		
		// /=
		int num9 = 40;
		int num10 = 5;
		
		//num9 /= num10; -> num9 = num9 / num10;
		System.out.println("/=연산자 : num9/=num10 "+(num9/=num10));
		
		// %=
		int num11 = 4;
		int num12 = 3;
		
		//num11 %= num12; -> num11 = num11 % num12;
		System.out.println("%=연산자 : num11%=num12 "+(num11%=num12));
	}
}
