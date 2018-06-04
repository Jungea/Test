/*
 * �ۼ���: ������
 * �ۼ���: 2018.05.28.
 * ���ϳ���: ����Ŭ����
 */

package hw9_2;

class Student {
	int age;
	int score;
}

@FunctionalInterface
interface Tester {
	boolean test(Student s);
}

public class Main {
	public static void check(Student s, Tester t) {
		boolean result = t.test(s);
		System.out.println(result);
	}

	public static void main(String... args) {
		System.out.println("hw9_2: ������ \n");

		Student kim = new Student();
		kim.age = 19;
		kim.score = 80;

		check(kim, new Tester() {  // ����Ŭ����(PassTester)
			@Override
			public boolean test(Student s) {
				return s.score >= 60;
			}
		});

		check(kim, new Tester() {  // ����Ŭ����(AdultTester)
			@Override
			public boolean test(Student s) {
				return s.age >= 20;
			}   
		});
	}
}

