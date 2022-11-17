package ex3_gugudan;

import java.sql.Time;
import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		//TimesTable이라고 하는 클래스를 만들고 showTable()이라고 하는 메서드를 정의한다
		//showTable()메서드에 구구단을 출력하는 코드를 작성
		//TimesTableMain클래스를 만들고 TimeTable객체를 생성 후 다음과 같은 결과를 출력하세요
		//Scanner를 통해 받는 값은 반드시 TimesTableMain클래스에서 하도록 한다
		
		//출력한 단을 입력 : 5
		// 5 * 1 = 5
		// 5 * 2 = 10
		// ...
		// 5 * 9 = 45
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		TimesTable tt = new TimesTable();
		tt.showTable(dan);
	}
}
