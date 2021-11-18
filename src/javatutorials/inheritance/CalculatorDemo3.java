package javatutorials.inheritance;

//상속한 클래스를 다시 상속하는 것도 가능
//기능 추가후 사용할 수 있음 -> 재활용성 증가
class DivCalculator extends MulCalculator {
	public DivCalculator(int left, int right) {
		super(left, right);
	}

	public void div() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		DivCalculator c1 = new DivCalculator(10,20);
		c1.avg();
		c1.sum();
		c1.mul();
		c1.div();
	}
}
