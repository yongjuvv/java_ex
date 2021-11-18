package javatutorials.condition;

public class SwitchDemo {
	public static void main(String[] args) {
		
		System.out.println("switch(1)");
		
		//switch() 괄호 안에 있는 값 이후의 케이스를 모두 다 실행.(break가 걸리지 않으면)
		// 괄호 안에 있는 값이 case로 주어지지 않는다면 default문 실행
		switch(1) {
		case 1 :
			System.out.println("one");
			break;
		case 2 :
			System.out.println("two");
		case 3 :
			System.out.println("three");
		default :
			System.out.println("switch 1 default");
			break;
		}
		System.out.println("switch(2)");
		switch(2) {
		case 1 :
			System.out.println("four");
			break;
		case 2 :
			System.out.println("five");
			break;
		case 3 :
			System.out.println("six");
		default :
			System.out.println("switch 2 default");
			break;
		}
		switch(4) {
		case 1 :
			System.out.println("four");
			break;
		case 2 :
			System.out.println("five");
			break;
		case 3 :
			System.out.println("six");
		default :
			System.out.println("switch 3 default");
			break;
		}
		
		
	}
}
