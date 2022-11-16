package ex1_break;

public class Ex3_break_label {
	public static void main(String[] args) {
		//label : 특정 반복문에 이름을 붙혀 두 개 이상의 반복문을 
		//제어할 수 있도록 하는 키워드
		
		//label은 항상 쌍으로 존재합니다.
		//label의 이름은 자기가 원하는대로 사용이 가능합니다.
		//label은 자신을 포함하고 있는 상위 개념에게만 달 수 있습니다.
		
		happy : for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print(j+ " ");
			}
			for(int k = 1; k <= 10; k++) {
				if(k % 2 == 0) {
					break happy;
				}
				System.out.println(k + " ");
			}//inner
			System.out.println();
		}//outer
		System.out.println("label을 이용하여 outer for문을 빠져나옴");
	}
}
