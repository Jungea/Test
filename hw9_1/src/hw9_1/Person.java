package hw9_1;

public class Person implements Speakable {
	private String name;  // �̸�

	public Person(String name) {  // ������
		this.name = name;
	}

	public String getName() {  // �̸� getter
		return name+"�Դϴ�.";
	}

	public void setName(String name) {  // �̸� setter 
		this.name = name;
	}

	@Override
	public void speak() {
		System.out.println("�ȳ��ϼ���.");
	}
}