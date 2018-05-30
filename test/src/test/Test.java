package test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] tile = new boolean[5][5];
		Random r = new Random(); // 딱정벌레 목표
		int x=0,y=0;  // 딱정벌레 실제 이동 좌표
		int steps=0;  // 시도
		int n=r.nextInt(5);  // 목표지점 x좌표(0~4)
		int m=r.nextInt(5);  // 목표지점 y좌표 (0~4)
		
		System.out.println("출발=(0,0)");
		System.out.println("목표="+"("+n+","+m+")");
		System.out.print("이동경로=(0,0)");

		for(int i=0; i<20; i++) {
			int travel= r.nextInt(4);  // 딱정벌레 움직임
			if(x==n && y==m) {
				break;
			}
			else if(travel==0 && x>0) {  // 위로[-1][]
				x--;
			}
			else if(travel==1 && x<4) {  // 아래로 [+1][] 
				x++;
			}
			else if(travel==2 && y>0) {  // 왼쪽으로 [][+1]
				y--;
			}
			else if(y<4) {  // 오른쪽으로 [][-1]
				y++;
			}
			
			System.out.print("("+x+","+y+")"); // 이동경로 출력
			tile[x][y]=true;  // 딱정벌레 이동한 타일을 true로
			steps++;  // 시도 증가
		}

		System.out.println("\n-------");
		for(int a=0; a<5; a++) {
			for(int b=0; b<5; b++) {  //타일출력
				if(a==n && b==m)  // 목표지점
					System.out.print("G");
				else if(a==0 && b==0)  // 시작지점
					System.out.print("S");
				else if(tile[a][b]==true)  // 딱정벌레 이동한 타일
					System.out.print("#");
				else  // 이동하지 않은 타일
					System.out.print(".");
			}
			System.out.println();
		}
		System.out.println("-------");
		
		if(steps<20)
			System.out.println("성공" + steps );
		else if(n==x && m==y)
			System.out.println("성공" + steps );
		else
			System.out.println("실패");
	}

}
