package ex_homework;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		//메인에다가  0~9사이의 난수를 100개 저장하는 배열을 만들고 , 해당 배열이 가지고 있는 각 방의
		//난수를 판별하여 그래프화 해보자
		//단, 발생한 난수의 그래프화 작업은 PrintGragph클래스가 하도록 한다
		
		/*
		 * 100개를 생성해서 배열의 각 방에다 넣는다
		 * 0의 개수 : ############ 12
		 * 1의 개수 : ######### 9
		 * 2의 개수 : ########### 11
		 * ...
		 * 9의 개수 : #### 4
		 * */
		
		int[] ar = new int[10]; //100개의 난수를 각각의 방에 넣기 위한 배열
		for(int i = 0; i < 100; i++) {
			int nan = new Random().nextInt(10);
			ar[nan]++;
		}
		
		PaintGraph pg = new PaintGraph();
		pg.print(ar);
	}
}
