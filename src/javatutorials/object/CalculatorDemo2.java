package javatutorials.object;

//Ŭ������ �����Ǿ� �ִ� ������ �޼ҵ��� ����
//������ �ǹ��� calculator��� Ŭ������ ����
class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(left + right);
	}

	public void avg() {
		System.out.println((left + right) / 2);
	}

}

public class CalculatorDemo2 {
	public static void main(String[] args) {
		//new Calculator()�� Ŭ���� Calculator�� ��ü���� ��ǰ���� ����� ���
		//Ŭ���� : ���赵, �ν��Ͻ� : ��ǰ
		//���� c1�� �ν��Ͻ��� ����
		Calculator c1 = new Calculator();
		c1.setOprands(10, 30);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		//�ϳ��� Ŭ������ �������� ���� �ٸ� ����(����)�� ���� �ν��Ͻ��� ����� ���� �ٸ� �ൿ�� �ϰ� �ȴ�.
		// ==> �ϳ��� Ŭ������ �������� �ν��Ͻ��� �� �� �ִ� ==> ��ü ������ �����ϴ� ��Ȱ�뼺
	}

}
