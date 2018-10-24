import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	ViewController controller;
	
	public MainFrame() {
		setTitle("ī�����");
		setLocation(new Point(600,250));  // ������� â ��ġ
		setVisible(true);  // â ���� ��
		setPreferredSize(new Dimension(400,400));  // âũ��
		pack();  // ������Ʈ��ŭ ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		controller = new ViewController(this);
		
	}
	
	public static void main(String args[]) {
		
		new MainFrame();
		
	}

}
