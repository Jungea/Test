/*
 * �ۼ���: ������
 * �ۼ���: 2018. 3. 16.
 * ���� ���� ����: �޷� ȯ��
 */

package hw2_1;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw2_1: ������\n");

		// Scanner�� ���� input�� Ű���� �Է��� ���� Scanner ��ü �����Ͽ� ����
		Scanner input = new Scanner(System.in);

		// 500�� ����, 100�� ����, 50�� ����, 10�� ����  �Է¹���
		System.out.print("500�� ���� �Է�: ");
		int fiveHundredWon = input.nextInt();

		System.out.print("100�� ���� �Է�: ");
		int oneHundredWon = input.nextInt();

		System.out.print("50�� ���� �Է�: ");
		int fiftyWon = input.nextInt();

		System.out.print("10�� ���� �Է�: ");
		int tenWon = input.nextInt();

		// ȯ���� ����� ����
		final int EXCHANGE_RATE = 1060;

		// ���� �Ѿ��� ���
		int total = 500*fiveHundredWon + 100*oneHundredWon + 50*fiftyWon + 10*tenWon;

		// ���� �Ѿ�, �޷� �׼�, ���� ��ȭ�� ���
		System.out.println("\n���� �Ѿ� = " + total);

		int dallar = (int)(total/EXCHANGE_RATE);
		System.out.println("�޷� �׼� =  " + dallar);

		System.out.println("���� ��ȭ = " + (total-(dallar*EXCHANGE_RATE)));
	}

}
