package hw9_1;

public class Dog implements Speakable {
	private int age;  // ����

	public Dog(int age) {  // ������
		this.age = age;
	}

	public int getAge(int age) {  // ���� getter
		return age;
	}

	public void setAge(int age) {  // ���� setter
		this.age = age;
	}

	public void speak() {
		for(int i=0; i<age ; i++)
			System.out.print("��");
		System.out.println();
	}
}