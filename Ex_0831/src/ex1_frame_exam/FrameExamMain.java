package ex1_frame_exam;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

public class FrameExamMain {
	public static void main(String[] args) {
		Frame frame = new Frame("메모장");
		frame.setBounds(700,200,250,400);
		frame.setBackground(Color.CYAN);
		frame.setLayout(null); //자동배치 끄기
		frame.setResizable(false); //생성된 프레임의 사이즈 변경을 막는다
		
		Font font = new Font("",Font.PLAIN,20);
		
		//키보드에서 넘어온 값을 입력하기 위한 객체 TextField
		TextField tf = new TextField();
		tf.setBounds(10, 35, 176, 30);
		tf.setFont(font);
		
		//TextField에 적힌 값을 넘기는 "확인" 버튼
		Button btn_input = new Button("확인");
		btn_input.setBounds(190, 40, 50, 20);
		btn_input.setEnabled(false); //버튼 클릭 비활성화

		//키보드에서 여러줄을 동시에 입력받을 수 있도록 하는 클래스
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(9, 70, 230, 280);
		ta.setEditable(false); //ta에 임의로 값을 추가할 수 없도록 하는 기능
		
		//저장과 종료버튼
		Button btn_save = new Button("저장");
		Button btn_close = new Button("종료");
		btn_save.setBounds(10, 356, 110, 30);
		btn_close.setBounds(130, 356, 110, 30);
	
		//tf에 값이 들어가 있는지 확인하여 확인 버튼을 활성화 또는 비활성화
		tf.addTextListener(new TextAdapter(tf, btn_input));
		
		//확인버튼 클릭시 tf에 있는 값을 ta로 복사해서 넣어주는 기능
		btn_input.addActionListener(new InputButtonAdapter(tf, ta));
		
		//저장버튼을 눌렀을 때 ta값을 저장하는 이벤트 감지자 등록
		btn_save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ta에 쓰여진 내용을 문자열 형태로 가져오기
				String message = ta.getText();
				
				//경로를 설정하는 FileDialog
				FileDialog fd = new FileDialog(frame, "저장",FileDialog.SAVE);
				
				fd.setVisible(true);
				
				String path = fd.getDirectory() + fd.getFile()+".txt";
				//System.out.println(path);
				
				try {
					FileWriter fw = new FileWriter(path);
					fw.write(message);
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		//종료버튼을 눌렀을 때 작동하는 이벤트 감지자 등록
		btn_close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0); 모든 프레임을 종료하는 메서드
				frame.dispose(); //현재 프레임만 종료
			}
		});
		
		frame.add(tf); //frame에 TextField추가
		frame.add(btn_input); //frame에 확인버튼 추가
		frame.add(ta); //frame TextArea 추가
		frame.add(btn_save);
		frame.add(btn_close);
		
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		frame.setVisible(true);
	}
}
