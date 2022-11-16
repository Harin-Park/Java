package ex1_array;

import java.util.Random;
import java.util.Scanner;

public class Ex3_array {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		//배열 arr에 담겨있는 모든 값의 합을 출력하세요.
		//출력형태
		//결과 : 150
		
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		//for(int i : arr){
		//	total += i;
		//}
		System.out.printf("결과 : %d", total);
		System.out.println("--------------------------------------");
		//키보드에서 배열의 크기를 입력받아서 배열에 알파벳이 자동으로 'A'부터 들어가도록 해보자
		//예: 
		//배열의 길이는 몇으로 하시겠습니까? : 5
		//ABCDE
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이는 몇으로 하시겠습니까? :");
		int lg = sc.nextInt();
		
		char [] cArr = new char[lg];
		char ch = 'A';
		
		for(int i = 0; i < cArr.length; i++) {
			cArr[i] += ch++;
		}
		System.out.println(cArr);
		System.out.println("--------------------------------------");
		//변수 money에 10~5000사이의 난수를 발생시켜 넣습니다.
		//단, 345, 2104,82같이 1의 자리 숫자는 10을 곱하여 반드시 0으로 맞추도록 한다.
		//발생된 난수 money를 동전으로 바꾸면 각 동전이 몇 개씩 필요한지 판단하는 코드작성
		//가능한 적은 수의 동전을 사용하도록 한다.
		//4170
		//500원 : 8
		//100원 : 1
		//50원 : 1
		//10원 : 2
		
		int[] coin = {500,100,50,10};
		int money = new Random().nextInt(500) + 1;
		money *= 10;
		System.out.println("금액 : " + money);
	
		for(int i = 0; i < coin.length; i++) {
			int result = money/ coin[i];
			System.out.printf("%d원 : %d개\n", coin[i],result);
			money %= coin[i];
		}
	}
}
