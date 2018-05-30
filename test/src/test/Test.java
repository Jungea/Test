package test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] tile = new boolean[5][5];
		Random r = new Random(); // �������� ��ǥ
		int x=0,y=0;  // �������� ���� �̵� ��ǥ
		int steps=0;  // �õ�
		int n=r.nextInt(5);  // ��ǥ���� x��ǥ(0~4)
		int m=r.nextInt(5);  // ��ǥ���� y��ǥ (0~4)
		
		System.out.println("���=(0,0)");
		System.out.println("��ǥ="+"("+n+","+m+")");
		System.out.print("�̵����=(0,0)");

		for(int i=0; i<20; i++) {
			int travel= r.nextInt(4);  // �������� ������
			if(x==n && y==m) {
				break;
			}
			else if(travel==0 && x>0) {  // ����[-1][]
				x--;
			}
			else if(travel==1 && x<4) {  // �Ʒ��� [+1][] 
				x++;
			}
			else if(travel==2 && y>0) {  // �������� [][+1]
				y--;
			}
			else if(y<4) {  // ���������� [][-1]
				y++;
			}
			
			System.out.print("("+x+","+y+")"); // �̵���� ���
			tile[x][y]=true;  // �������� �̵��� Ÿ���� true��
			steps++;  // �õ� ����
		}

		System.out.println("\n-------");
		for(int a=0; a<5; a++) {
			for(int b=0; b<5; b++) {  //Ÿ�����
				if(a==n && b==m)  // ��ǥ����
					System.out.print("G");
				else if(a==0 && b==0)  // ��������
					System.out.print("S");
				else if(tile[a][b]==true)  // �������� �̵��� Ÿ��
					System.out.print("#");
				else  // �̵����� ���� Ÿ��
					System.out.print(".");
			}
			System.out.println();
		}
		System.out.println("-------");
		
		if(steps<20)
			System.out.println("����" + steps );
		else if(n==x && m==y)
			System.out.println("����" + steps );
		else
			System.out.println("����");
	}

}
