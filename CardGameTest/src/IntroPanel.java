import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class IntroPanel extends JPanel {
	int select =0;
	Image intro_image;

	public IntroPanel() {
		intro_image = Toolkit.getDefaultToolkit().getImage("images/deck.jpg");
		this.addKeyListener(new IntroKeyEvent(this));
	}

	@Override
	public void paint(Graphics g) { 
		// �̹����� �׷��ش�. �̹�����ü,����x,����y,����,����,������ ������;
		g.drawImage(intro_image, 0, 0, getWidth(), getHeight(), this);
		// g��ü�� ��Ʈ��Ÿ���� �ٲپ��ش�. ���ڵ忡���� �����۾��� 30����Ʈ
		g.setFont(new Font("myFont", Font.BOLD, 30));
		// ��Ʈ���� �������� ����
		g.setColor(Color.blue);
		// ���ڿ� ����!!
		g.drawString("ī�� ����", 120, 100);
		// ��Ʈ������ ���ڿ� ����.
		g.setFont(new Font("secondFont", Font.ITALIC, 20));
		g.setColor(Color.blue);
		g.drawString("GameStart", 130, 250);
		g.drawString("Quit", 130, 300);
		
		if(selct ==0)
			g.drawString("->", 100, 250);

	}

}
