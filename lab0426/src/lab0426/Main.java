package lab0426;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address hong = new Address("한국","인천");
		Address park = new Address("미국","뉴욕");
		
		Student s1 = new Student("홍길동",hong);
		Student s2 = new Student("박길동",park);
		
		System.out.println(s1.getName());
		System.out.println((s1.getAddress()).getCountry());
	}

}
