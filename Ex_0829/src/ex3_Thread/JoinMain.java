package ex3_Thread;

public class JoinMain {
	public static void main(String[] args) {
		JoinTest1 jt1 = new JoinTest1();
		JoinTest2 jt2 = new JoinTest2();
		Thread t1 = new Thread(jt1);
		Thread t2 = new Thread(jt2);
		
		t1.start();
		
		try {
			t1.join(); //t1을 제외한 나머지 스레드를 block
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("메인스레드 : " + i);
		}
	}
}
