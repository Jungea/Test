/*
 * �ۼ���: ������
 * �ۼ���: 2018. 05. 20
 * ���ϳ���: has-a ����
 */

package hw7_2;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_2: ������  \n");

		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(1.5, new Point(10, 20));
		Circle c3 = new Circle(3.5, new Point(10, 20));

		System.out.println(c2.sameCenter(c1));    // false
		System.out.println(c2.sameCenter(c3));    // true

		printCircle(c2);
	}
	// (1) �Ű������� ���� �� c�� ������, �߽��� x, y��ǥ�� ����ϴ� �޼ҵ�
	private static void printCircle(Circle c) {
		System.out.println(c.getRadius());
		System.out.println(c.getCenter().getX());
		System.out.println(c.getCenter().getY());
	}
}