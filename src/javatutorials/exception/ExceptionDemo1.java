package javatutorials.exception;

class A {
	private int[] arr = new int[3];
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch(Exception e) {
			System.out.println("Exception");
		} finally { //예외와 상관없이 try구문이 실행되면 반드시 finally가 실행된다.
						  // finally는 예외와는 상관없이 반드시 끝내줘야 하는 작업에서 사용할 수 있음
						  // ex) 예외와는 상관 없이 데이터베이스와의 접속을 끊어야 하는 상황
			System.out.println("finally");
		}
		//Exception e 캐치문을 가장 먼저 둔다면?
		//-> Exception은 ArithmeticException, ArrayIndexOutOfBoundsException보다 포괄적인 예외를 의미하여 Exception이후에 등장하는 catch문을 실행하지 않는다
		
		//+ 추가 throw사용
		// throw는 예외를 다음 사용자에게 전가하는 것
		// A 클래스에서 throw를 통해 예외처리를 했다면 A클래스에 존재하는 메소드를 사용할 다음 사용자가 try catch를 통해 예외처리를 해야 한다.
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args) {
		A a = new A();
		a.z(10,1);
		a.z(1,0);
		a.z(2,1);
	}
}
