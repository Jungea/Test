import java.awt.Container;

public class ViewController {
	MainFrame mainFrame; // ���������� �����ڷ� ��������
	Container contentPane; // contentPane
	IntroPanel introPanel; // ���� �г�

	public ViewController(MainFrame mainFrame) { 
		this.mainFrame = mainFrame; //�����ڷ� ������������ �޴´� 
		init(); 
	}

	private void init() {
		introPanel = new IntroPanel(); // �����г� ����
		contentPane = mainFrame.getContentPane(); // �������������κ��� ����Ʈ������ �����´�
		contentPane.add(introPanel); // ����Ʈ���ο� �����г� �߰�
		introPanel.requestFocus(); // Ű�̺�Ʈ�� �ޱ����� �г��� ��Ŀ�����ش�.(�гο� �̺�Ʈ�� �޷��ֱ⶧����)

	}

}
