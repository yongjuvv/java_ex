package javatutorials.inheritance;

//����� Ŭ������ �ٽ� ����ϴ� �͵� ����
//��� �߰��� ����� �� ���� -> ��Ȱ�뼺 ����
class DivCalculator extends MulCalculator {
	public DivCalculator(int left, int right) {
		super(left, right);
	}

	public void div() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		DivCalculator c1 = new DivCalculator(10,20);
		c1.avg();
		c1.sum();
		c1.mul();
		c1.div();
	}
}
