package hw7_2;

public class RegularMember extends Member {  // 정회원
	public RegularMember(int age) {  // 나이를 매개변수로 받아 초기화하는 생성자
		super(age);
	}

	@Override
	public int getPayment() {
		return 1000;
	}
}