package ex2_img;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImgTest {
	public static void main(String[] args) {
		Frame f = new Frame("이미지");
		f.setBounds(500, 300, 600, 600);
		f.setLayout(null);
		
		ImageIcon back = new ImageIcon("src/images/tiger1.jpeg");
		JLabel jl_back = new JLabel(back);
		jl_back.setBounds(50, 50, 500, 500);
		
		ImageIcon btnIcon = new ImageIcon("src/images/tiger3.jpeg");
		JButton jb = new JButton(btnIcon);
		jb.setBounds(20,40,100,106);
		
		ImageIcon back2 = new ImageIcon("src/images/tiger2.jpeg");
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jl_back.getIcon() == back) {
					jl_back.setIcon(back2); //JLabel의 아이콘을 back2로 변경한다					
				}else {
					jl_back.setIcon(back);
				}
			}
		});
		
		f.add(jl_back);
		f.add(jb);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true); 
	}
}
