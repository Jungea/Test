package lab0426;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address hong = new Address("�ѱ�","��õ");
		Address park = new Address("�̱�","����");
		
		Student s1 = new Student("ȫ�浿",hong);
		Student s2 = new Student("�ڱ浿",park);
		
		System.out.println(s1.getName());
		System.out.println((s1.getAddress()).getCountry());
	}

}
