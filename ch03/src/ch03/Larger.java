/*
 * �ۼ���: ������
 * �ۼ���: 2018.03.28.
 * ����: if ���� ����Ͽ� Ȧ���� ¦���� �����ϴ� ���α׷�
 */

package ch03;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		int x = scan.nextInt();
		
		System.out.print("�ι�° ����: ");
		int y = scan.nextInt();
		
		System.out.print("ū���� ");
		System.out.print( (x>y) ? x:y);
	}

}
