package hw7_2;

public class HourlyMember extends Member {  // �ð��� ȸ��
	private int time;  // ���ð�

	// ����, ���ð��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public HourlyMember(int age, int time) {
		super(age);
		this.time = time;
	}

	@Override
	public int getPayment() {
		return time*100;
	}
}
