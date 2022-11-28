package ex2_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//실행중인 frame의 우상단 x버튼을 클릭하면 호출되는 메서드
		System.out.println("나는 x버튼 눌렀음");
		System.exit(0); //열려있는 모든 프레임을 종료하는 메서드
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		//우상단 최소화(_)버튼을 클릭하면 호출되는 메서드
		System.out.println("최소화 되었음");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		//최소화 상태의 frame이 원래 크기로 돌아왔을 때 호출되는 메서드
		System.out.println("최소화 취소");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
