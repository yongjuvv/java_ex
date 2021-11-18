package javatutorials.classinstance;

class Calculator{
	//static�� �ɹ�(����, �޼ҵ�) �տ� ���̸� Ŭ������ �ɹ��� �ȴ�. 
	//Ŭ���� ������ �뵵 
	// - �ν��Ͻ��� ���� ������ �ʾƾ� �ϴ� ���� �����ؾ� �� ��
	// - �ν��Ͻ��� ������ �ʿ䰡 ���� ���� Ŭ������ �����ϰ� ���� ���
	// - ���� ���� ������ ��� �ν��Ͻ��� �����ؾ� �ϴ� ���
	static double PI = 3.14;
	int base = 0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(left + right + base);
	}
	public void avg() {
		System.out.println((left + right + base) / 2);
	}
}


public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(20, 40);
		c1.avg();
		c1.sum();
		//�ν��Ͻ��� ���ؼ� PI(Ŭ���� ����)�� ����
		System.out.println(c1.PI);
		//Ŭ������ ���ؼ� PI�� ����
		System.out.println(Calculator.PI);
		
	}
}
