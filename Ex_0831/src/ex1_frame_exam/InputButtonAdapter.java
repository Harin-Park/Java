package ex1_frame_exam;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputButtonAdapter implements ActionListener{
	
	TextField tf;
	TextArea ta;
	
	public InputButtonAdapter(TextField tf, TextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//tf에 입력된 값을 확인이 눌렸을 때 ta로 옮겨주는 기능
		//ta.setText() //매번 값을 초기화
		ta.append(tf.getText()); //tf에 써져있는 내용을 ta에 붙혀넣겠다
		tf.requestFocus(); //tf로 커서를 이동시킨다
		tf.setText(""); //ta로 복사하고 난 후 tf를 비워준다
	}
}
