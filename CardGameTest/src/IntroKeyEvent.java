import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class IntroKeyEvent implements KeyListener{
	IntroPanel introPanel; // �г��� �����ڷ� ����.

	public IntroKeyEvent(IntroPanel introPanel) {
		this.introPanel = introPanel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Ű���� 40 ��,����Ű ���� �̸�
		if (e.getKeyCode() == 38) {
			introPanel.select = 0;
			// Ű���� 38 ��,����Ű �Ʒ��� �̸�
		} else if (e.getKeyCode() == 40) {
			introPanel.select = 1;
		}
		// �г��� �ٽ� �׷��ش�.
		introPanel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
