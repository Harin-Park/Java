package ex2_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		//1부터 10까지 난수 발생시키기
		//new Random().nextInt((큰수 - 작은수)+1) + 시작하는 수
		int rnd = new Random().nextInt(10) + 1;
		System.out.println(rnd);
	}
}
