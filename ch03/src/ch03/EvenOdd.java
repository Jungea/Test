/*
 * 작성자: 정은애
 * 작성일: 2018.03.28.
 * 내용: if 문을 사용하여 홀수와 짝수를 구별하는 프로그램
 */

package ch03;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int num = scan.nextInt();
		
		if(num%2==0)
			System.out.println("입력된 정수는 찍수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
