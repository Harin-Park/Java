package ex3_Thread;

public class Ex1_Thread {
	public static void main(String[] args) {
		//스레드 : 독립적인 실행 단위입니다
		//하나의 프로세스 안에서 두 가지 이상의 일을 하도록 하는 것
		
		//프로세스(Process) : 실행중인 프로그램
		//스레드(Thread) : 프로세스에서 작업을 수행하는 것
		
		//스레드의 생성
		//스레드를 작업하는 방식에는 두가지가 있습니다
		
		//Thread클래스 상속
		class ThreadTest extends Thread{
			@Override
			public void run() {//run메서드 오버라이딩
				//작업할 내용
			}
		}
		
		//Runnable 인터페이스 구현
		class ThreadTest2 implements Runnable{
			@Override
			public void run() { //run()메서드 오버라이딩 필수!
				//작업할 내용
			}
		}
		
		//스레드 클래스 상속시 스레드 코드가 실행할 수 있도록  JVM에 요청
		ThreadTest t1 = new ThreadTest(); //객체생성
		t1.start();
		
		System.out.println("----------------------------------");
		//러너블 인터페이스 구현시 스레드 코드가 실행될 수 있도록 JVM에 요청
		ThreadTest2 t2 = new ThreadTest2();
		Thread t = new Thread(t2);
		t.start();
	}
}
