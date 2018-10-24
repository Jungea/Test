import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class IntroKeyEvent implements KeyListener{
	IntroPanel introPanel; // 패널을 생성자로 받음.

	public IntroKeyEvent(IntroPanel introPanel) {
		this.introPanel = introPanel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키값이 40 즉,방향키 위쪽 이면
		if (e.getKeyCode() == 38) {
			introPanel.select = 0;
			// 키값이 38 즉,방향키 아래쪽 이면
		} else if (e.getKeyCode() == 40) {
			introPanel.select = 1;
		}
		// 패널을 다시 그려준다.
		introPanel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
