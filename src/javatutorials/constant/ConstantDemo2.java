package javatutorials.constant;

//인터페이스를 사용하여 상수를 깔끔하게 정리
//인터페이스에서 선언된 변수는 무조건 public static final의 속성을 가짐
//ex) FRUIT 인터페이스의 APPLE은 public static final int APPLE = 1과 같음
interface FRUIT {
	int APPLE = 1, PEACH = 2, BANANA = 3;
}
interface COMPANY {
	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class ConstantDemo2 {
	public static void main(String[] args) {
		
		int type = FRUIT.APPLE; //인터페이스를 통해서 이름을 구분할 수 있음
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
