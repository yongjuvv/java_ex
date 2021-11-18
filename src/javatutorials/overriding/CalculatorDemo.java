package javatutorials.overriding;

class Calculator {
	int left, right;

	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public int avg() {
		int result = (this.left + this.right) / 2;
		return result;
	}

}

class SubableCalculator extends Calculator {
	public SubableCalculator(int left, int right) {
		super(left, right);
	}
	//메소드 오버라이딩
	//부모클래스에서 정의된 메소드를 자식클래스에서 재정의(오버라이딩)함
	//자식클래스가 부모클래스에서 정의된 메소드를 재정의하면서 독자적인 기능을 추가할 수 있음 -> 재활용성 향상
	//오버라이딩을 하기 위해서는 
	// 1. 메소드의 이름
	// 2. 메소드의 매개변수의 숫자와 데이터 타입, 순서
	// 3. 메소드의 리턴 타입이 같아야 한다.
	public void sum() {
		System.out.println("실행결과는 : " +(this.left + this.right) +"입니다.");
	}

	public void sub() {
		System.out.println(this.left - this.right);
	}
	
	public int avg() {
		return super.avg();
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		SubableCalculator c1 = new SubableCalculator(20, 10);
		System.out.println("avg 실행결과 : " + c1.avg());
		c1.sub();
		c1.sum();
		//자식 클래스에서 메소드 오버라이딩을 하게 되면, 자식 클래스에서의 메소드가 우선순위가 있기에 자식 클래스 메소드의 결과값이 호출된다.
	}
}
