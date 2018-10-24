import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	ViewController controller;
	
	public MainFrame() {
		setTitle("카드게임");
		setLocation(new Point(600,250));  // 윈도우상 창 위치
		setVisible(true);  // 창 보여 줌
		setPreferredSize(new Dimension(400,400));  // 창크기
		pack();  // 컴포넌트만큼 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		controller = new ViewController(this);
		
	}
	
	public static void main(String args[]) {
		
		new MainFrame();
		
	}

}
