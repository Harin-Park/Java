package ex5_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Button {
	public static void main(String[] args) {
		Frame f = new Frame();

		f.setBounds(500, 200, 400, 400);
		f.setLayout(null); //자동배치 끄기

		//버튼 생성
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		
		//버튼의 위치와 크기 설정
		btn1.setBounds(70, 90, 100, 50);
		btn2.setBounds(230, 90, 100, 50);

		//생성된 버튼 프레임에 추가하기
		f.add(btn1);
		f.add(btn2);
		
		//버튼들이 참조할 이벤트 감지자 생성
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ActionCommand() : 버튼에 쓰여진 내용을 출력하는 메서드
				switch(e.getActionCommand()) {
				case "1":
					System.out.println("1번 버튼 클릭됨");
					break;
				case "2":
					System.out.println("2번 버튼 클릭됨");
					break;
				}
			}
		};

		btn1.addActionListener(al);
		btn2.addActionListener(al);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);
	}
}
