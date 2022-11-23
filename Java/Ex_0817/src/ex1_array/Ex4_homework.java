package ex1_array;

import java.util.Random;

public class Ex4_homework {
	public static void main(String[] args) {
		//1~45의 난수를 발생시켜 로또번호를 생성하는 프로그램
		//6개의 번호가 하나도 겹치면 안 됩니다
		int[] lotto = new int[6];
		
		outer : for(int i = 0; i < lotto.length;) {
			lotto[i] += new Random().nextInt(45)+1;
			//중복값을 비교하는 반복문
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}//if
			}//inner
			System.out.print(lotto[i] + " ");
			i++;
		}//outer
	}
}
