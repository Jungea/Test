/*
 * �ۼ���: ������
 * �ۼ���: 2018. 05. 20
 * ���ϳ���: �߻� Ŭ����
 */

package hw7_2;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_2: ������  \n");

		// (1) ũ�Ⱑ 4�� Member �迭�� ����
		Member[] m = new Member[4];
		
		// (2) ���� 4�� �����Ͽ� ���� ȸ�� �迭�� ����
		m[0] = new HourlyMember(22, 2);  // �ð���ȸ��(���� 22, ���ð� 2)
		m[1] = new HourlyMember(33, 3);  // �ð���ȸ��(���� 33, ���ð� 3)
		m[2] = new RegularMember(44);  // ��ȸ��(���� 44)
		m[3] = new RegularMember(55);  // ��ȸ��(���� 55) 
		
		// (3) ȸ���� ���� ����� ���� ��� <--- �ݺ��� �̿��� ��, ���� ���ͷ� �̿� ����
		int sum = 0;
		for(int i=0; i<4; i++)
			sum+=m[i].getAge();
		System.out.println("������� = "+sum/4.0);
		
		// (4) ȸ���� ȸ�� ���� ���� ��� <--- �ݺ��� �̿��� ��, ȸ�� ���ͷ� �̿� ����
		sum=0;
		for(int i=0; i<4; i++)
			sum+=m[i].getPayment();
		System.out.println("ȸ�� �� = "+sum);
		
	}

}
