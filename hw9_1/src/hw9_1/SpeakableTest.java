/*
 * �ۼ���: ������
 * �ۼ���: 2018. 05. 20
 * ���ϳ���: speak()��� �������̽�
 */

package hw9_1;

public class SpeakableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1: ������ \n");

		// (1) ũ�Ⱑ 4�� Speakble �迭�� ����
		Speakable[] s = new Speakable[4];

		// (2) Person ��ü 2��, Dog ��ü 2���� �����Ͽ� �迭�� ����
		s[0] = new Person("������");
		s[1] = new Person("ȫ�浿");
		s[2] = new Dog(2);
		s[3] = new Dog(5);

		// (3) �ݺ����� �̿��Ͽ� ������ ����:
		// ��� �迭 ���� ��ü�� ���� speak()�� ȣ���ϰ�,
		// ���� �迭 ���Ұ� ����̸� �߰��� �̸��� ��ȸ(getName() ȣ��)�Ͽ� ����� ��
		for(int i=0; i<4; i++) {
			s[i].speak();
			if(s[i] instanceof Person)
				System.out.println(((Person)s[i]).getName());
			System.out.println();
		}

	}

}
