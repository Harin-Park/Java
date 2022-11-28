package ex3_Thread;

public class Ex3_MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("러너블 진행중" + i);
		}
	}
}
