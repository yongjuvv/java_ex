package javatutorials.condition;

public class SwitchDemo {
	public static void main(String[] args) {
		
		System.out.println("switch(1)");
		
		//switch() ��ȣ �ȿ� �ִ� �� ������ ���̽��� ��� �� ����.(break�� �ɸ��� ������)
		// ��ȣ �ȿ� �ִ� ���� case�� �־����� �ʴ´ٸ� default�� ����
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
