package 0422;
/*
 * 작성자: 김소연
 * 작성일:4월 23일
 * 내용: 은행 계좌 프로그램
 */

public class BankAccount {
   //필드
   private int number; //계좌번호
   private String name; // 예금주
   private int balance; // 잔액

   //계좌번호, 예금주명, 잔액을 매개변수로 받아 초기화하는 constructor - 잔액이 음수이면 0으로 초기화
   public BankAccount(int number, String name, int balance) {
      this.number=number;
      this.name=name;
      this.balance=balance;
      if(balance<0) 
         balance=0;
   }
   //계좌번호, 예금주명을 매개변수로 받아 초기화하는 constructor - 위의 constructor를 호출하여 초기화하도록 할 것
   public BankAccount(int number, String name) {
      this(number,name,0);
   }
   public int getNumber() {return number;}
   public String getName() {return name;}
   public void setName(String name) {this.name=name;}
   public int getBalance() {return balance;}

   void deposit(int in) {
      balance=balance+in;
   }
   //출금 - 잔액 부족시 출금은 이루어지지 않고 오류 메시지 출력
   void withdraw(int out) {
      if(balance<out)
         System.out.println("잔액부족");
      else 
         balance-=out;
   }
   //toString() - 계좌번호, 예금주명, 잔액을 문자열로 리턴
   @Override
   public String toString() {
      return "BankAccount [number=" + number + ", name=" + name + ", balance=" + balance + "]";
   }
   //송금 - 다른 은행계좌 객체와 송금액을 매개변수로 받아 내 계좌로부터 다른 계좌로 송금
    //내 계좌의 잔액 부족시 송금은 이루어지지 않고 오류 메시지 출력
   public void remit(int anumber, int money) {
      if(balance<money)
         System.out.println("송금액 부족");
      else
         balance-=money;
   }
}