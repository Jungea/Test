package 0422;

import java.util.Scanner;
/*
 * �ۼ���: ��ҿ�
 * �ۼ���:4�� 23��
 * ����: ���� ���� ���α׷�
 */
public class Test {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("hw6_2: ��ҿ�");

      BankAccount account1=new BankAccount(1, "kim",9000); //���¹�ȣ 1, �����ָ� kim, �ܾ� 9000���� �ʱ�ȭ�� ������� ����
      BankAccount account2=new BankAccount(2, "lee"); //���¹�ȣ 2, �����ָ� lee�� �ʱ�ȭ�� ������� ����

      Scanner scan = new Scanner(System.in);
      //����ڷκ��� �Աݾ��� �Է¹޾� account2�� �Ա�
      System.out.print("�Աݾ�: ");
      int money = scan.nextInt();
      account2.deposit(money);
      //����ڷκ��� ��ݾ��� �Է¹޾� account2���� ���
      money = scan.nextInt();
      account2.withdraw(money);
      //����ڷκ��� �Աݾ��� �Է¹޾� account2�� �Ա�
      money = scan.nextInt();
      account2.deposit(money);
      //����ڷκ��� ��ݾ��� �Է¹޾� account2���� ���
      money = scan.nextInt();
      account2.withdraw(money);
      //����ڷκ��� �۱ݾ��� �Է¹޾� account2���� account1�� �۱��ϵ��� ����
      money = scan.nextInt();
      account2.remit(account1, money);
      //����ڷκ��� �۱ݾ��� �Է¹޾� account2���� account1�� �۱��ϵ��� ����
      money = scan.nextInt();
      account2.remit(account1, money);
      //account2�� �����ָ��� park���� ����
      account2.setName("park");
      //account2�� ���¹�ȣ, �����ָ�, �ܾ� ���
      System.out.println(account2.toString());
      //account1�� ���¹�ȣ, �����ָ�, �ܾ� ���
      System.out.println(account1.toString());
   }
}