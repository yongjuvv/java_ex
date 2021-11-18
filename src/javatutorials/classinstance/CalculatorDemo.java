package javatutorials.classinstance;

class Calculator{
	//static을 맴버(변수, 메소드) 앞에 붙이면 클래스의 맴버가 된다. 
	//클래스 변수의 용도 
	// - 인스턴스에 따라서 변하지 않아야 하는 값이 존재해야 할 때
	// - 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶을 경우
	// - 값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우
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
		//인스턴스를 통해서 PI(클래스 변수)에 접근
		System.out.println(c1.PI);
		//클래스를 통해서 PI에 접근
		System.out.println(Calculator.PI);
		
	}
}
