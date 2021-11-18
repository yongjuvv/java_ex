package javatutorials.abstractclass;

abstract class Calculator{
	int right, left;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("sum : " + (this.left + this.right));
	}
	public void avg() {
		System.out.println("avg : "+ (this.left + this.right)/2);
	}
}
//�߻� Ŭ������ ����� ����
//1 : ��� Ŭ������ ����и�(setOprands, run)�� ���� ����Ŭ������ �ξ� �ߺ��� ���ְ� ���������� ���Ǽ��� ���� �� ����

public class CalculatorDemo {
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
	}
}
