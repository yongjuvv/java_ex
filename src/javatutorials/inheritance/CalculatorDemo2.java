package javatutorials.inheritance;

class MulCalculator extends Calculator {
	public MulCalculator(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public void mul() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {
	public static void main(String[] args) {
		MulCalculator c1 = new MulCalculator(20,10);
		c1.avg();
		c1.sum();
		c1.mul();
	}
}
