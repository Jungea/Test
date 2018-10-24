import java.awt.Container;

public class ViewController {
	MainFrame mainFrame; // 매인프레임 생성자로 받을예상
	Container contentPane; // contentPane
	IntroPanel introPanel; // 시작 패널

	public ViewController(MainFrame mainFrame) { 
		this.mainFrame = mainFrame; //생성자로 매인프레임을 받는다 
		init(); 
	}

	private void init() {
		introPanel = new IntroPanel(); // 시작패널 생성
		contentPane = mainFrame.getContentPane(); // 매인프레임으로부터 컨텐트페인을 가져온다
		contentPane.add(introPanel); // 컨텐트패인에 시작패널 추가
		introPanel.requestFocus(); // 키이벤트를 받기위해 패널을 포커싱해준다.(패널에 이벤트가 달려있기때문에)

	}

}
