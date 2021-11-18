package javatutorials.inheritance;

class Calculator {
	int left, right;

	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

//CalculatorŬ������ ��ӹ޴� Ŭ���� ����
//����� ���ؼ� �ڵ��� �ߺ��� �����ϰ�, �θ� Ŭ������ �����ϸ� �ڽ� Ŭ�������� �� ������ ���� �� ����
// -> �������� ��, ��Ȱ�뼺 ����
class SubableCalculator extends Calculator {
	public SubableCalculator(int left, int right) {
		super(left, right);
		// super�� �θ�Ŭ������ �ǹ�
	}

	public void sub() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		SubableCalculator c1 = new SubableCalculator(10, 20);
		// �ν��Ͻ��� ������ �� �θ� Ŭ������ �����ڸ� �ڵ����� ȣ���ϰ� �Ǿ� ����
		// �ڹٴ� �ڵ����� �⺻ �����ڸ� ������������, �����ڰ� ���������� �����ڸ� ����� �Ǹ� �ڵ����� �⺻ �����ڸ� �������� �ʴ´�.

		c1.avg();
		c1.sub();
		c1.sum();
	}
}
