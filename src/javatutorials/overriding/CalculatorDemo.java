package javatutorials.overriding;

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

	public int avg() {
		int result = (this.left + this.right) / 2;
		return result;
	}

}

class SubableCalculator extends Calculator {
	public SubableCalculator(int left, int right) {
		super(left, right);
	}
	//�޼ҵ� �������̵�
	//�θ�Ŭ�������� ���ǵ� �޼ҵ带 �ڽ�Ŭ�������� ������(�������̵�)��
	//�ڽ�Ŭ������ �θ�Ŭ�������� ���ǵ� �޼ҵ带 �������ϸ鼭 �������� ����� �߰��� �� ���� -> ��Ȱ�뼺 ���
	//�������̵��� �ϱ� ���ؼ��� 
	// 1. �޼ҵ��� �̸�
	// 2. �޼ҵ��� �Ű������� ���ڿ� ������ Ÿ��, ����
	// 3. �޼ҵ��� ���� Ÿ���� ���ƾ� �Ѵ�.
	public void sum() {
		System.out.println("�������� : " +(this.left + this.right) +"�Դϴ�.");
	}

	public void sub() {
		System.out.println(this.left - this.right);
	}
	
	public int avg() {
		return super.avg();
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		SubableCalculator c1 = new SubableCalculator(20, 10);
		System.out.println("avg ������ : " + c1.avg());
		c1.sub();
		c1.sum();
		//�ڽ� Ŭ�������� �޼ҵ� �������̵��� �ϰ� �Ǹ�, �ڽ� Ŭ���������� �޼ҵ尡 �켱������ �ֱ⿡ �ڽ� Ŭ���� �޼ҵ��� ������� ȣ��ȴ�.
	}
}
