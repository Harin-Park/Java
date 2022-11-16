package ex1_array;

public class Ex1_array {
	public static void main(String[] args) {
		//배열(array) : 같은 자료형끼리 모아둔 하나의 묶음
		//데이터의 효율적인 관리를 위해서 반드시 필요합니다
		
		//정수형 변수의 초기화 /여러개 필요하다면? 10000개가 필요하다면?
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1) 배열 선언
		//자료형[] 배열명;
		int[] ar;
		
		//2) 배열 생성
		//배열명 = new 자료형[(배열의)크기];
		ar = new int[5];
		
		//배열의 초기화
		//배열명도 중복이 될 수 없다
		//int[] ar = {100,200,300,400};
		
		//배열에 데이터 넣기
		//배열명[인덱스번호] = 넣고자 하는 데이터;
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		ar[4] = 500;
		
		//변수의 출력
		System.out.println(su1);
		
		//배열의 출력
		//System.out.println(배열명[인덱스번호]);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println("----------------------");
		
		//배열의 출력2
		//ar.length : 배열의 방의 개수
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		//배열에 데이터 넣는법2
		int[] arr;
		arr = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)*100;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
	}
}
