package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		//continue문 : 반복문 내에서 특정 문장을 건너뛰고자 할 때 사용
		for(int i = 1; i <= 2; i++) {
			for(int j =1; j <= 5; j++) {
				if(j % 2 == 0) {
					continue;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
