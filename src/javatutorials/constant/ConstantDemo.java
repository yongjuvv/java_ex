package javatutorials.constant;

public class ConstantDemo {
	//fruit
	private final static int APPLE = 1; //final -> �޶����� �ʴ� ��� static -> class�� ����
	private final static int PEACH = 2;
	private final static int BANANA = 3;
	
	//company
	private final static int GOOGLE = 1;
// private final static int APPLE = 2; //��� APPLE , �����̸� APPLE�� ���� �̸��� ������ ���� ���� but final���� ����� �� ���� --> ���� �߻�
	private final static int ORACLE =3;
	
	public static void main(String[] args) {
		
		int type = APPLE;
		switch(type) {
		case 1 :
			System.out.println(57 + "kcal");
			break;
		case 2: 
			System.out.println(34 + "kcal");
			break;
		case 3 :
			System.out.println(93 + "kcal");
			break;
		}
	}
}
