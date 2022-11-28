package ex6_event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Ex1_event {
	public static void main(String[] args) {
		Frame f = new Frame();

		f.setBounds(500, 200, 400, 400);
		f.setLayout(null); // 자동배치 끄기

		// 화면에 텍스트를 출력하는 클래스
		Label q1 = new Label("관심 분야는 무엇입니까?");
		q1.setBounds(10, 30, 150, 50);
		q1.setBackground(Color.CYAN);

		// 다중선택이 가능한 CheckBox생성
		Checkbox movie = new Checkbox("영화");
		Checkbox music = new Checkbox("음악");

		// 라디오 버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox c1 = new Checkbox("이과", group, true);
		Checkbox c2 = new Checkbox("문과", group, false);

		movie.setBounds(10, 90, 70, 30);
		music.setBounds(80, 90, 70, 30);

		c1.setBounds(10, 190, 70, 30);
		c2.setBounds(80, 190, 70, 30);

		// 체크박스에 대한 이벤트 감지자
		ItemListener checkListener = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String res = "";
				switch (e.getItem().toString()) {
				case "영화":
					res = e.getStateChange() == 1 ? "영화선택" : "영화취소"; // 1:true, 0:false
					break;

				case "음악":
					res = e.getStateChange() == 1 ? "음악선택" : "음악취소"; // 1:true, 0:false
					break;
				}
				System.out.println(res);
			}
		};

		// 라디오버튼에 대한 이벤트 감지자
		ItemListener radioListener = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String radioStr = e.getItem().toString();
				//System.out.println(radioStr);
				//메시지 다이얼로그 생성
				JOptionPane.showMessageDialog(f, radioStr + " 선택함");
			}
		};

		movie.addItemListener(checkListener);
		music.addItemListener(checkListener);
		c1.addItemListener(radioListener);
		c2.addItemListener(radioListener);

		// 상단 상태창의 버튼을 관리하는 감지자 : WindowListener
		// 사용자가 만든 버튼을 관리하는 감지자 : ActionListener
		// 체크박스의 이벤트를 관리하는 감지자 : ItemListener

		f.add(q1);
		f.add(movie); // 프레임에 체크박스 추가
		f.add(music);
		f.add(c1);
		f.add(c2);

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	}
}
