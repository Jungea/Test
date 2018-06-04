package hw7_2;

public abstract class Member {  // 추상 클래스
	private int age;  // 나이

	public Member(int age) {  //  나이를 매개변수로 받아 초기화 하는 생성자
		this.age = age;
	}

	public int getAge() {  // 나이 getter
		return age;
	}

	public int getPayment() { // 회비를 조회하는 메소드(abstract)
		return 0;
	}
}