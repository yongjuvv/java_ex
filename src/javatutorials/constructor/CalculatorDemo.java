package javatutorials.constructor;

class Calculator {
	int left, right;
	
	//생성자
	//생성자는 인스턴스를 생성해주는 역할을 하는 특수한 메소드
	//반환값을 필요로하는 작업에서는 생성자를 사용하지 않는다
	//생성자의 이름은 클래스의 이름과 동일하도록 약속되어 있다.
	
	//생성자는 어떤 메소드보다 먼저 실행된다.
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
