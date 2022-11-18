package ex_updown;

import java.util.Random;

public class Updown {
	private int random = new Random().nextInt(100)+1;
	private int count = 0;
	
	public String check(int n) {
		
		count++;
		
		if(n < random) {
			System.out.println("Up!!");
		}else if(n > random) {
			System.out.println("Down!!");
		}else {
			System.out.println(count + "회 만에 정답!!");
			return "정답";
		}
		
		return "오답";
	}
}
