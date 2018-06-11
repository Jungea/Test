/*
 * 작성자: 정은애
 * 작성일: 2018.06.11.
 * 내용: 백준 9655.돌게임
 */

package bj_9655;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();  //n을 입력받음
		
		int check=0;  //반복문 탈출용
		int i;  //몇번째
		for(i=1 ; ; i++) {
			
			switch(n) {
			case 1:
			case 3:
				if(i % 2 == 0)  //짝수번째
					System.out.println("CY");
				else  //홀수번째
					System.out.println("SK");
				check=1;
				break;
			case 2: //내가 못임김(2개는 가져갈 수 없다.)
				n-=1;
				break;
			default:
				if((int)(Math.random()*2) == 0) //1개
					n-=1;
				else  //3개
					n-=3;
			}
			if(check==1)
				break;
		}
	}
}
