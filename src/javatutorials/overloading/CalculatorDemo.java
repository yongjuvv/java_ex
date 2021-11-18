package javatutorials.overloading;

class Calculator {
	int left, right;
	int third = 0;

	public void setOprands(int left, int right) {
		System.out.println("setOprands(left, right)");
		this.left = left;
		this.right = right;
	}
	//자바는 메소드 이름이 같아도 매개변수의 개수가 다르면 다른 메소드로 인식함 -> 메소드 오버로딩
	public void setOprands(int left, int right, int third) {
		System.out.println("setOprands(left, right. third)");
		this.setOprands(left, right);
		this.third = third;
	}

	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}

	public void avg() {
		System.out.println((this.left + this.right  + this.third) / 3);
	}
	
	public void mul() {
		System.out.println(this.left * this.right * this.third);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.avg();
		c1.sum();
		c1.mul();
		
		c1.setOprands(10, 20, 30);
		c1.avg();
		c1.sum();
		c1.mul();
	}
}
