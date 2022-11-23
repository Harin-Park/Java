package ex1_operator;

public class Homework {
	public static void main(String[] args) {
		/*
		 * 과수원이 있다,
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각
		 * 배 : 5개
		 * 사과 : 7개
		 * 오렌지 : 5개
		 * 과수원에서 하루에 생산되는 총 개수,
		 * 시간당 생산되는 과일의 개수(과일마다 각각)
		 * 전체 과일의 평균 생산 갯수(시간당 평균)
		 * 평균값을 담는 변수는 float으로 할 것
		 * */
		
		int pear = 5;
		int apple = 7;
		
		int orange = 5;
		int today = pear + apple + orange;
		
		float p_hour = (float)pear / 24; // 정수/정수 -> 정수(int) 4byte
										// 실수/정수 -> 실수
		float a_hour = (float)apple / 24;
		float o_hour = (float)orange / 24;
		
		float avg = (p_hour + a_hour + o_hour)/3;
		
		System.out.println("하루 생산 총 개수 : " + today);
		System.out.println("시간당 배 생산 개수 : " + p_hour);
		System.out.println("시간당 사과 생산 개수 : " + a_hour);
		System.out.println("시간당 오렌지 생산 개수 : " + o_hour);
		System.out.println("전체 시간당 평균 개수 : " + avg);
	}
}
