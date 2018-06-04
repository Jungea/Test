package 0422;
/*
 * �ۼ���: ��ҿ�
 * �ۼ���:4�� 23��
 * ����: ���� ���� ���α׷�
 */

public class BankAccount {
   //�ʵ�
   private int number; //���¹�ȣ
   private String name; // ������
   private int balance; // �ܾ�

   //���¹�ȣ, �����ָ�, �ܾ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor - �ܾ��� �����̸� 0���� �ʱ�ȭ
   public BankAccount(int number, String name, int balance) {
      this.number=number;
      this.name=name;
      this.balance=balance;
      if(balance<0) 
         balance=0;
   }
   //���¹�ȣ, �����ָ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor - ���� constructor�� ȣ���Ͽ� �ʱ�ȭ�ϵ��� �� ��
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
   //��� - �ܾ� ������ ����� �̷������ �ʰ� ���� �޽��� ���
   void withdraw(int out) {
      if(balance<out)
         System.out.println("�ܾ׺���");
      else 
         balance-=out;
   }
   //toString() - ���¹�ȣ, �����ָ�, �ܾ��� ���ڿ��� ����
   @Override
   public String toString() {
      return "BankAccount [number=" + number + ", name=" + name + ", balance=" + balance + "]";
   }
   //�۱� - �ٸ� ������� ��ü�� �۱ݾ��� �Ű������� �޾� �� ���·κ��� �ٸ� ���·� �۱�
    //�� ������ �ܾ� ������ �۱��� �̷������ �ʰ� ���� �޽��� ���
   public void remit(int anumber, int money) {
      if(balance<money)
         System.out.println("�۱ݾ� ����");
      else
         balance-=money;
   }
}