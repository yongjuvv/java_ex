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
//추상 클래스를 만드는 이유
//1 : 모든 클래스의 공통분모(setOprands, run)의 경우는 상위클래스에 두어 중복을 없애고 유지보수의 편의성을 꾀할 수 있음

public class CalculatorDemo {
	public static void execute(Calculator cal) {
		System.out.println("실행 결과는");
		cal.run();
	}
//	public static void execute(CalculatorDecoPlus cal) {
//		cal.run();
//	}
//	public static void execute(CalculatorDecoMinus cal) {
//		cal.run();
//	}
	//execute의 매개변수 타입이 Calculator가 되지 않는다면 execute 메소드를 2개 만들어야 함 -> 코드의 중복이 발생
	//코드의 중복을 최소화하기 위해 인스턴스 c1, c2의 데이터 타입을 Calculator로 지정
	//이 맥락에서의 다형성이란 하나의 클래스(Calculator)가 다양한 동작 방법(DecoPlus, DecoMinus)을 가지고 있는데 이를 다형성이라 할 수 있음.
	
	public static void main(String[] args) {
		Calculator c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		execute(c1);
		
		Calculator c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 30);
		execute(c2);
	}
}
