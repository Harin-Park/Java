package ex3_Thread;

public class SleepMain {
	//sleep() : 스레드를 지정한 시간동안 Blocked상태로 만든다
	//시간은 1000분의 1초까지 결정할 수 있으며 지정된 시간이 지나면 다시 runnable(실행가능한)상태로 돌아간다
	public static void main(String[] args) {
		SleepThread st = new SleepThread();
		st.start();
	}
}
