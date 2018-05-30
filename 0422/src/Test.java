package 0422;

import java.util.Scanner;
/*
 * 작성자: 김소연
 * 작성일:4월 23일
 * 내용: 은행 계좌 프로그램
 */
public class Test {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("hw6_2: 김소연");

      BankAccount account1=new BankAccount(1, "kim",9000); //계좌번호 1, 예금주명 kim, 잔액 9000으로 초기화한 은행계좌 생성
      BankAccount account2=new BankAccount(2, "lee"); //계좌번호 2, 예금주명 lee로 초기화한 은행계좌 생성

      Scanner scan = new Scanner(System.in);
      //사용자로부터 입금액을 입력받아 account2에 입금
      System.out.print("입금액: ");
      int money = scan.nextInt();
      account2.deposit(money);
      //사용자로부터 출금액을 입력받아 account2에서 출금
      money = scan.nextInt();
      account2.withdraw(money);
      //사용자로부터 입금액을 입력받아 account2에 입금
      money = scan.nextInt();
      account2.deposit(money);
      //사용자로부터 출금액을 입력받아 account2에서 출금
      money = scan.nextInt();
      account2.withdraw(money);
      //사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
      money = scan.nextInt();
      account2.remit(account1, money);
      //사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
      money = scan.nextInt();
      account2.remit(account1, money);
      //account2의 예금주명을 park으로 수정
      account2.setName("park");
      //account2의 계좌번호, 예금주명, 잔액 출력
      System.out.println(account2.toString());
      //account1의 계좌번호, 예금주명, 잔액 출력
      System.out.println(account1.toString());
   }
}