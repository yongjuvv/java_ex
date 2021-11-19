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
		} finally { //���ܿ� ������� try������ ����Ǹ� �ݵ�� finally�� ����ȴ�.
						  // finally�� ���ܿʹ� ������� �ݵ�� ������� �ϴ� �۾����� ����� �� ����
						  // ex) ���ܿʹ� ��� ���� �����ͺ��̽����� ������ ����� �ϴ� ��Ȳ
			System.out.println("finally");
		}
		//Exception e ĳġ���� ���� ���� �дٸ�?
		//-> Exception�� ArithmeticException, ArrayIndexOutOfBoundsException���� �������� ���ܸ� �ǹ��Ͽ� Exception���Ŀ� �����ϴ� catch���� �������� �ʴ´�
		
		//+ �߰� throw���
		// throw�� ���ܸ� ���� ����ڿ��� �����ϴ� ��
		// A Ŭ�������� throw�� ���� ����ó���� �ߴٸ� AŬ������ �����ϴ� �޼ҵ带 ����� ���� ����ڰ� try catch�� ���� ����ó���� �ؾ� �Ѵ�.
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
