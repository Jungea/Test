package hw7_2;

public class Circle {  // ���� ǥ���ϴ� Ŭ���� Circle
	private double radius;  // ������
	private Point center;   // �߽� ��(PointŸ��)

	// (2) �������� �Ű������� �޾� �ʱ�ȭ�ϰ�, �߽���  x, y��ǥ�� 0, 0�� ������ �ʱ�ȭ�ϴ� ������
	public Circle(double radius) {
		this.radius = radius;
		center = new Point(0, 0);
	}

	// (3) �������� �߽��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public Circle(double radius, Point center) {
		this.radius = radius;
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public Point getCenter() {
		return center;
	}

	// (4) ���� ���� �Ű������� ���� ��(other)�� �߽� ����
	// x, y ��ǥ�� ��� �������� ����(true/false)�� �����ϴ�  �޼ҵ�
	// -�� �޼ҵ忡�� ��¹� ����
	public boolean sameCenter(Circle other) {
		if(center.getX() == other.center.getX())
			return (center.getY() == other.center.getY());
		else
			return false;
	}
}
