package javatutorials.finals;

class Calculator {
    static final double PI = 3.14;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.PI);
//		Calculator.PI = 3.13; final로 지정된 변수는 한번 값이 할당되면 그 값을 바꿀 수 없음
		//final은 실행되는 과정에서 한번 값이 정해진 이후에는 변수 내의 값이 바뀌지 않도록 하는 규제이다.
	}
}
