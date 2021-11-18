package javatutorials.constructor;

class Calculator {
	int left, right;
	
	//������
	//�����ڴ� �ν��Ͻ��� �������ִ� ������ �ϴ� Ư���� �޼ҵ�
	//��ȯ���� �ʿ���ϴ� �۾������� �����ڸ� ������� �ʴ´�
	//�������� �̸��� Ŭ������ �̸��� �����ϵ��� ��ӵǾ� �ִ�.
	
	//�����ڴ� � �޼ҵ庸�� ���� ����ȴ�.
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right );
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();

	}
}
