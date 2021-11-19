package javatutorials.exception;

class Calculator{
	int right, left;
	public void setOprands(int left, int right) {
//		if(right == 0) {
//			throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
//			//사용자가 두번째 인자에 0을 넣게 된다면 IllegalArgumentException를 던짐
//		}
		
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(this.right == 0) {
			throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
		}
		
		try {
			System.out.print("계산 결과는 ");
			System.out.print(this.left / this.right);
			System.out.print("입니다.");
			//예외의 발생이 예상되는 로직
		} catch (Exception e) { //변수 e의 데이터타입은 Exception
												// Exception은 자바에서 기본적으로 제공하는 클래스로 java.lang에 소속되어 있음
			System.out.println("오류가 발생했습니다. : " + e.getMessage());
			//e.getMessage()는 오류에 대한 기본적인 내용을 출력, 상세하지 않음
			System.out.println(e.toString());
			//e.toString은 getmessage()보다 더 자세한 예외 정보를 제공한다. 어떤 예외에 해당하는지에 대한 정보를 제공
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
//			printStackTrace()는 가장 자세한 예외 정보를 제공한다. 리턴값이 존재하지 않으며, 메소드가 내부적으로 예외 결과를 화면에 출력한다.
			//예외가 발생했을 때 실행되는 로직
		}
		
	}
}


public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
	}
}
