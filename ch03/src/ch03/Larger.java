/*
 * 작성자: 정은애
 * 작성일: 2018.03.28.
 * 내용: if 문을 사용하여 홀수와 짝수를 구별하는 프로그램
 */

package ch03;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int x = scan.nextInt();
		
		System.out.print("두번째 정수: ");
		int y = scan.nextInt();
		
		System.out.print("큰수는 ");
		System.out.print( (x>y) ? x:y);
	}

}
