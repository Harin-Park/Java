package ex1_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		//논리연산자 : 비교연산자를 통해 연산지 두 개 이상 필요할 때 작성하는 연산자
		//&& ||
		
		/*
		 * &&(and) : 두 개의 연산이 참일 때 참인 값을 갖는다
		 * 참 && 참 = 참
		 * 참&&거짓 = 거짓
		 * 거짓&&참 = 거짓
		 * 거짓&&거짓 = 거짓
		 */
		//앞의 조건이 거짓이면 뒤의 조건은 연산을 아예 하지 않는다
		int age = 21;
		int limit = 25;
		boolean res;
		res = (limit - age) <= 3 && (age += 2) >= 20; //age = age + 2
		System.out.println("&&연산자 : " + res);
		System.out.println("age= " + age);
		
		// ||(or) : 앞의 조건이나 뒤의 조건이 하나라도 참이라면 참인 값을 갖는 연산자
		/*
		 * 참||참 = 참
		 * 참||거짓 = 참
		 * 거짓||참 = 참
		 * 거짓||거짓 = 거짓
		 * */
		int n1 = 10;
		int n2 = 20;
		
		res = (n1 - n2) > 10 || (n2+=2) == 20;
		System.out.println("||연산자 : " + res);
		System.out.println("age= " + n2);
		
		// ! : not의 의미
		// true -> false, false -> true
		
		//증감연산자 : 1씩 증가를 시키거나 1씩 감소를 시키는 연산자
		//++, --
		//1. 선행증감연산자
		//2. 후행증감연산자
		System.out.println("------------------------------");
		int a = 10;
		int b = 12;
		
		System.out.println("++a : "+ ++a);
		System.out.println("a++ : " + a++);
		//후행증감연산자의 경우 1증감하는 것은 맞지만 다음번에 사용할 때 1을 증감시킨 상태로 출력을 하겠다
		System.out.println("a = " + a);
		
		System.out.println("--b : " + --b);
		System.out.println("b-- : " + b--);
		System.out.println("b = " + b);
		
		//a = 12;
		++a; //13
		a++; //13(14)
		a++; //14(15)
		++a; //16
		++a; //17
		a++; //17(18)
		
		//a의 값 예상
		System.out.println("a = " +a);
		
		
	}
}
