package ex5_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {
		Frame f = new Frame("버튼 생성하기");
		f.setBounds(500,300,400,400);
		
		//frame은 기본적으로 add되는 객체를 화면에 가득 채우도록 설계가 되어있습니다
		//이것을 무시하고 add되는 객체들의 위치나 크기값을 지정할 수 있습니다
		//setLayout(null)입니다
		//이것을 '프레임의 자동배치를 끈다'라고 표현합니다
		f.setLayout(null);
		
		//버튼 생성
		Button btnOK = new Button("확인");
		Button btnClose = new Button("닫기");
		
		//자동배치가 꺼져있는 프레임에 추가될 버튼들의 크기와 위치값을 지정
		btnOK.setBounds(70,90,100,50);
		btnClose.setBounds(230,90,100,50);

		//생성된 버튼을 frame에 추가
		f.add(btnOK);
		f.add(btnClose);
		
		//버튼들에게 클릭이벤트 감지자 등록
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok버튼 눌렀음");
			}
		});
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Close버튼 눌렀음");
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
	}
}
