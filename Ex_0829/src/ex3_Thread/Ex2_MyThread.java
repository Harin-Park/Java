package ex3_Thread;

public class Ex2_MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("스레드 진행중" + i);
		}
	}
}
