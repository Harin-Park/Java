package ex3_scanner;

import java.util.Scanner;

public class Ex2_homework {
	public static void main(String[] args) {
		//Scanner를 통해 정수 n1, n2를 입력받는다
		//그리고 n1부터 n2까지의 합을 계산하여 그 결과를 출력하는 프로그램을 작성
		//ex) 2, 5를 입력받으면 2+3+4+5의 연산결과인 14를 출력해야 한다
		//문제2) n1이 n2보다 큰 경우도 생각을 해보자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n1의 값을 입력해주세요 :");
		int n1 = sc.nextInt();
		System.out.print("n2의 값을 입력해주세요 :");
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		int total = 0;
		
		for(int i = n1; i <= n2; i++) {
			total += i;
		}
		System.out.printf("total : %d", total);
	}
}
