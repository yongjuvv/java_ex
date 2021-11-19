package javatutorials.polymorphism;

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

class CalculatorDecoMinus extends Calculator {
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
	public static void execute(Calculator cal) {
		System.out.println("���� �����");
		cal.run();
	}
//	public static void execute(CalculatorDecoPlus cal) {
//		cal.run();
//	}
//	public static void execute(CalculatorDecoMinus cal) {
//		cal.run();
//	}
	//execute�� �Ű����� Ÿ���� Calculator�� ���� �ʴ´ٸ� execute �޼ҵ带 2�� ������ �� -> �ڵ��� �ߺ��� �߻�
	//�ڵ��� �ߺ��� �ּ�ȭ�ϱ� ���� �ν��Ͻ� c1, c2�� ������ Ÿ���� Calculator�� ����
	//�� �ƶ������� �������̶� �ϳ��� Ŭ����(Calculator)�� �پ��� ���� ���(DecoPlus, DecoMinus)�� ������ �ִµ� �̸� �������̶� �� �� ����.
	
	public static void main(String[] args) {
		Calculator c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		execute(c1);
		
		Calculator c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 30);
		execute(c2);
	}
}
