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
//추상 클래스를 만드는 이유
//1 : 모든 클래스의 공통분모(setOprands, run)의 경우는 상위클래스에 두어 중복을 없애고 유지보수의 편의성을 꾀할 수 있음

public class CalculatorDemo {
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
	}
}
