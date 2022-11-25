package ex3_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		Ex2_MyThread mt = new Ex2_MyThread();
		mt.start(); //run()메서드를 호출하는 메서드
		//mt.run();은 run()메서드를 독립적으로 수행하지 못 한다
		//즉, 일반 메서드처럼 호출해버립니다
		//run()메서드의 내용을 별개로 수행하고 싶다면 t.start()를 이용해야 합니다
		
		Ex3_MyThread2 mt2 = new Ex3_MyThread2();
		Thread t = new Thread(mt2);
		t.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("메인함수 실행중" + i);
		}
		
		/*
		 * 스레드의 라이프 사이클
		 * 스레드는 현재 상태에 따라 네 가지 형태로 분류할 수 있으며, 상태가 변화하는 주기를
		 * Life Cycle이라고 한다
		 *  
		 * <스레드 상태>
		 * new : 스레드가 new를 통해서 객체화된 상태, Runnable이 될 수 있는 상태이며
		 * 아직 대기열에 올라가지 못 한 상태
		 *  
		 * Runnable : start()메서드가 호출되면 new상태에서 Runnable상태가 된다
		 * Runnable상태가 되면 실행할 수 있는 상태로 대기하게 되며 스케줄레 의해 선택되면 run()메서드를 바로 수행한다
		 *  
		 * Blocked : 실행중인 스레드가 sleep(), join()메서드를 호출하게 되면 Blocked상태가 된다
		 * Blocked상태가 되면 스케줄레 의해 선택받을 수 없다
		 * 
		 * Dead : run()메서드의 실행을 모두 완료하게 되면 스레드는 Dead상태가 된다
		 * 할당받는 메모리와 정보 모두 삭제된다
		 *  */
	}
}
