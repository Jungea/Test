package hw7_2;

public abstract class Member {  // �߻� Ŭ����
	private int age;  // ����

	public Member(int age) {  //  ���̸� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
		this.age = age;
	}

	public int getAge() {  // ���� getter
		return age;
	}

	public int getPayment() { // ȸ�� ��ȸ�ϴ� �޼ҵ�(abstract)
		return 0;
	}
}