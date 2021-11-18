package javatutorials.io;

public class InputForeachDemo {
	//자바는 메소드 main의 인자 String[] args를 통해서 사용자가 입력한 값을 전달한다.
	public static void main(String[] args) {
		for(String e : args) {
			System.out.println(e);
		}
	}
}
