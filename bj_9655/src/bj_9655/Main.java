/*
 * �ۼ���: ������
 * �ۼ���: 2018.06.11.
 * ����: ���� 9655.������
 */

package bj_9655;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();  //n�� �Է¹���
		
		int check=0;  //�ݺ��� Ż���
		int i;  //���°
		for(i=1 ; ; i++) {
			
			switch(n) {
			case 1:
			case 3:
				if(i % 2 == 0)  //¦����°
					System.out.println("CY");
				else  //Ȧ����°
					System.out.println("SK");
				check=1;
				break;
			case 2: //���� ���ӱ�(2���� ������ �� ����.)
				n-=1;
				break;
			default:
				if((int)(Math.random()*2) == 0) //1��
					n-=1;
				else  //3��
					n-=3;
			}
			if(check==1)
				break;
		}
	}
}
