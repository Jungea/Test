/*
 * �ۼ���: ������
 * �ۼ���: 2018.03.28.
 * ����: if ���� ����Ͽ� Ȧ���� ¦���� �����ϴ� ���α׷�
 */

package ch03;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int num = scan.nextInt();
		
		if(num%2==0)
			System.out.println("�Էµ� ������ ����Դϴ�.");
		else
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
