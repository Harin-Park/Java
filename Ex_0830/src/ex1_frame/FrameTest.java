package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		//UI(User Interface) : 눈에 보여지는 것들을 디자인하는 작업
		//자바는 UI를 위해서 awt, swing이라고 하는 패키지를 제공하고 있습니다
		
		Frame f = new Frame();
		f.setSize(400,300); //프레임의 크기
		f.setLocation(500,200); //프레임이 생성될 위치
		f.setBackground(Color.CYAN); //배경색 지정
		
		Frame f2 = new Frame("두번째 프레임"); //상단에 제목 표시
		f2.setSize(400,300);
		f2.setLocation(500,200);
		
		f.setVisible(true);
		f2.setVisible(true);
	}
}
