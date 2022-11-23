package ex3_scanner;

//다른 패키지에 있는 클래스를 현재 패키지에서도 사용이 가능하도록 허락을 받는 개념
import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		//함수 : 어떠한 기능의 묶음
		//출력함수 : 콘솔에 출력을 하는 기능
		//입력함수 : 키보드로 입력한 값을 변수에 넣는 기능
		
//		String -> 클래스 자료형이고 기본 자료형은 아니다
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자를 입력해주세요 : ");
//		int num = sc.nextInt(); //키보드에서 int타입의 값을 받고 엔터를 치는 순간 
//					  			//변수에 사용자가 입력한 값을 대입해줍니다
//		System.out.println(num);
//		System.out.println("---------------------------");
//		System.out.print("문자열을 입력해주세요 : ");
//		String str = sc.next(); //키보드에서 문자열 타입의 값을 입력받아서 변수에 대입을 해줍니다
//		System.out.println(str);
//		System.out.println("---------------------------");
//		//나이,이름,전화번호(-포함)를 키보드에서 값을 입력받고 출력해보기
//		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.next();
//		System.out.print("전화번호를 입력하세요 : ");
//		String phone = sc.next();
//		System.out.printf("제 나이는 %d세 입니다.\n제 이름은 %s입니다.\n제 전화번호는 %s입니다.", age,name,phone);
		
		//키보드에서 값을 입력받고 해당하는 구구단을 출력해보세요
		//2~9 이외의 숫자가 들어오면 "2~9"까지의 숫자만 입력해주세요"라고 하는 출력문 출력하기
		
		System.out.println("단을 입력해주세요.");
		
		int dan = sc.nextInt();
		
		if(dan < 2 || dan > 9){
			System.out.println("2~9까지의 숫자만 입력해주세요.");
		}else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
			}
		}
	}
}
