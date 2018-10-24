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
		// 이미지를 그려준다. 이미지객체,시작x,시작y,가로,세로,보여줄 옵저버;
		g.drawImage(intro_image, 0, 0, getWidth(), getHeight(), this);
		// g객체에 폰트스타일을 바꾸어준다. 이코드에서는 굵은글씨에 30포인트
		g.setFont(new Font("myFont", Font.BOLD, 30));
		// 폰트색을 빨강으로 변경
		g.setColor(Color.blue);
		// 문자열 삽입!!
		g.drawString("카드 게임", 120, 100);
		// 폰트변경후 문자열 삽입.
		g.setFont(new Font("secondFont", Font.ITALIC, 20));
		g.setColor(Color.blue);
		g.drawString("GameStart", 130, 250);
		g.drawString("Quit", 130, 300);
		
		if(selct ==0)
			g.drawString("->", 100, 250);

	}

}
