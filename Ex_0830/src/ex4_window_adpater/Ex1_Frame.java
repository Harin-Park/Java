package ex4_window_adpater;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Frame {
	public static void main(String[] args) {
		Frame f = new Frame("어댑터 활용하기");
		f.setBounds(500,300,400,400);
		
		f.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
	}
}
