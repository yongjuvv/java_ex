package javatutorials.method;

public class MethodDemo1 {
	//메소드 정의
	public static void numbering() {
		int i = 0;
		while(i<10) {
			System.out.println("i = " +i);
			i++;
		}
	}
	
	//메소드 호출
	//main메소드는 규칙이며, 이것은 하나의 약속과 같음
	//자바가 main메소드를 실행하게 되는 것
	//나 : main메소드를 작성하는 주체 / 자바 : main 메소드를 실행하는 주체
	public static void main(String[] args) {
		numbering();
	}
}
