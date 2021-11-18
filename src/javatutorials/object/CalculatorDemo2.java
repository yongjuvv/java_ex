package javatutorials.object;

//클래스는 연관되어 있는 변수와 메소드의 집합
//계산기라는 의미의 calculator라는 클래스를 정의
class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(left + right);
	}

	public void avg() {
		System.out.println((left + right) / 2);
	}

}

public class CalculatorDemo2 {
	public static void main(String[] args) {
		//new Calculator()는 클래스 Calculator를 구체적인 제품으로 만드는 명령
		//클래스 : 설계도, 인스턴스 : 제품
		//변수 c1에 인스턴스를 담음
		Calculator c1 = new Calculator();
		c1.setOprands(10, 30);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		//하나의 클래스를 바탕으로 서로 다른 상태(변수)를 가진 인스턴스를 만들면 서로 다른 행동을 하게 된다.
		// ==> 하나의 클래스가 여러개의 인스턴스가 될 수 있다 ==> 객체 지향이 제공하는 재활용성
	}

}
