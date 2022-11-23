package ex2_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		int n = 0;
		while(n < 10) {
			n++;
			
			if(n % 2 == 0) {
				continue; //while문에서 continue를 만나면 조건식으로 이동
			}
			System.out.println(n);
		}//while
	}
}
