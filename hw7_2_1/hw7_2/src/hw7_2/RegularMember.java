package hw7_2;

public class RegularMember extends Member {  // ��ȸ��
	public RegularMember(int age) {  // ���̸� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
		super(age);
	}

	@Override
	public int getPayment() {
		return 1000;
	}
}