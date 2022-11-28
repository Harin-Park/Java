package ex2_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		Frame f = new Frame("이벤트 감지자");
	
		f.setBounds(500, 200, 400, 400);
		
		//frame에 클릭을 감지하는 이벤트 감지자 등록
		TestListener t1 = new TestListener();
		f.addWindowListener(t1);
		
		
		f.setVisible(true);
	}
}
