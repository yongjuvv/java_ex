package javatutorials.array;

public class ForeachDemo {
	public static void main(String[] args) {
		String[] members = {"최진혁", "한우리", "이고잉"};
		
		//members의 값을 변수 e에 담아서 전달한다
		for(String e : members) {
			System.out.println(e);
		}
	}
}
