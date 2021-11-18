package javatutorials.method;

public class ReturnDemo2 {

	public static String num(int i) {
		//return은 결과를 반환하기도 하지만 메소드를 중지시키는 역할도 한다.
		if(i == 0) {
			return "zero";
		}else if (i == 1) {
			return "one";
		}else if (i==2) {
			return "two";
		}else {
			return "out of bound";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(num(1));
	}
}
