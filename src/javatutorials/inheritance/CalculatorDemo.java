package javatutorials.inheritance;

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

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

//Calculator클래스를 상속받는 클래스 생성
//상속을 통해서 코드의 중복을 제거하고, 부모 클래스를 개선하면 자식 클래스들이 그 혜택을 받을 수 있음
// -> 유지보수 편리, 재활용성 증가
class SubableCalculator extends Calculator {
	public SubableCalculator(int left, int right) {
		super(left, right);
		// super는 부모클래스를 의미
	}

	public void sub() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		SubableCalculator c1 = new SubableCalculator(10, 20);
		// 인스턴스가 생성될 때 부모 클래스의 생성자를 자동으로 호출하게 되어 있음
		// 자바는 자동으로 기본 생성자를 생성해주지만, 개발자가 임의적으로 생성자를 만들게 되면 자동으로 기본 생성자를 생성하지 않는다.

		c1.avg();
		c1.sub();
		c1.sum();
	}
}
