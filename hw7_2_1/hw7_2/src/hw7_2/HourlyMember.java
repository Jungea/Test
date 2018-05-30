package hw7_2;

public class HourlyMember extends Member {  // 시간제 회원
	private int time;  // 사용시간

	// 나이, 사용시간을 매개변수로 받아 초기화하는 생성자
	public HourlyMember(int age, int time) {
		super(age);
		this.time = time;
	}

	@Override
	public int getPayment() {
		return time*100;
	}
}
