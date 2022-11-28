package ex7_choicebox;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {
	
	static String dayStr = "일요일";
	
	public static void main(String[] args) {
		Frame f = new Frame("질문");
		
		f.setBounds(500, 200, 400, 400);
		f.setLayout(null);
		
		//항목선택 상자
		Choice day = new Choice();
		day.add("일요일");
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		day.add("목요일");
		day.add("금요일");
		day.add("토요일");
		
		//choicebox는 setBounds 금지
		day.setSize(150,30);
		day.setLocation(100,100); //초이스 위치
		
		f.add(day);
		
		day.addItemListener(new ChoiceAdapter(f));
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);
	}
}
