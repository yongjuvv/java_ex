package javatutorials.exception;

class Calculator{
	int right, left;
	public void setOprands(int left, int right) {
//		if(right == 0) {
//			throw new IllegalArgumentException("�ι�° ������ ���� 0�� �� �� �����ϴ�.");
//			//����ڰ� �ι�° ���ڿ� 0�� �ְ� �ȴٸ� IllegalArgumentException�� ����
//		}
		
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(this.right == 0) {
			throw new ArithmeticException("0���� ������ ���� ������ �ʽ��ϴ�.");
		}
		
		try {
			System.out.print("��� ����� ");
			System.out.print(this.left / this.right);
			System.out.print("�Դϴ�.");
			//������ �߻��� ����Ǵ� ����
		} catch (Exception e) { //���� e�� ������Ÿ���� Exception
												// Exception�� �ڹٿ��� �⺻������ �����ϴ� Ŭ������ java.lang�� �ҼӵǾ� ����
			System.out.println("������ �߻��߽��ϴ�. : " + e.getMessage());
			//e.getMessage()�� ������ ���� �⺻���� ������ ���, ������ ����
			System.out.println(e.toString());
			//e.toString�� getmessage()���� �� �ڼ��� ���� ������ �����Ѵ�. � ���ܿ� �ش��ϴ����� ���� ������ ����
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
//			printStackTrace()�� ���� �ڼ��� ���� ������ �����Ѵ�. ���ϰ��� �������� ������, �޼ҵ尡 ���������� ���� ����� ȭ�鿡 ����Ѵ�.
			//���ܰ� �߻����� �� ����Ǵ� ����
		}
		
	}
}


public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
	}
}
