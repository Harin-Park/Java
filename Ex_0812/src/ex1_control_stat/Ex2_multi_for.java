package ex1_control_stat;

public class Ex2_multi_for {
	public static void main(String[] args) {
		//다중 for문 : for문 안에 for문이 겹쳐서 들어가는 경우
		//일반적으로는 이중 for문까지만 사용을 합니다.
		//for(int i = 0; i < 10; i++){
		//		for(초기식; 조건식; 증감식){
		//			outer for문이 한 번 반복될 때마다 inner for문이 실행
		// 		}inner
		// }//outer
		
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		
		for(int i = 1; i < 5; i++) { //y축
			for(int j = 1; j < 5; j++) { //x축
				System.out.print(" "+j);
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("----------------------------------------");
		
		// A B C D
		// E F G H
		// I J K L
		
		char ch = 'A'; //아스키코드 65
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.print(" " + ch++);
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("----------------------------------------");
		// * * * *
		// * * * *
		// * * * *
		// * * * *
		// * * * *
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		// *
		// * *
		// * * *
		// * * * *
		// * * * * * 
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		//	 	   *
		//	     * *
		//     * * *
		//   * * * *
		// * * * * *
		
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 5 - (i+1); j++) {
				System.out.print(" ");
			}//빈칸을 찍어주는 for문
			 
			for(int k =1; k <= i + 1; k++) {
				System.out.print("*");
			}//별을 찍어주는 for문
			System.out.println();
		}//outer
		
		
		
	}
}
