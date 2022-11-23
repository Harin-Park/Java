package ex1_break;

public class Ex2_break {
	public static void main(String[] args) {
		
		int n = 3;
		while(true) {
			System.out.println(n);
			n++;
			if(n > 10) {
				break;
			}
		}
		System.out.println("break로 while문을 빠져나옴");
	}
}
