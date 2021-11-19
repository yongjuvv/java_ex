package javatutorials.constant;

public class ConstantDemo {
	//fruit
	private final static int APPLE = 1; //final -> 달라지지 않는 상수 static -> class의 변수
	private final static int PEACH = 2;
	private final static int BANANA = 3;
	
	//company
	private final static int GOOGLE = 1;
// private final static int APPLE = 2; //기업 APPLE , 과일이름 APPLE이 같은 이름을 가져서 값이 변경 but final값은 변경될 수 없음 --> 오류 발생
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
