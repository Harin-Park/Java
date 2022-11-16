package ex2_continue;

public class Ex4_switch_label {
	public static void main(String[] args) {
		int n = 0;
		
		w : while(n < 10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch문 1번 거처감");
				break w;//switch문의 break는 반복문을 빠져나가는게 아닌 switch문만 나가게 됩니다
						//switch문의 break에 label을 붙히면 반복문을 빠져나가는 걸 확인할 수 있습니다
			case 2:
				System.out.println("switch문 2번 거쳐감");
				continue; //switch문만 단독으로 사용을 할 때는 continue를 사용할 수 없습니다
			}//switch
			System.out.println(n);
		}
			
	}
}
