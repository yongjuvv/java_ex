package javatutorials.constant;

//�������̽��� ����Ͽ� ����� ����ϰ� ����
//�������̽����� ����� ������ ������ public static final�� �Ӽ��� ����
//ex) FRUIT �������̽��� APPLE�� public static final int APPLE = 1�� ����
interface FRUIT {
	int APPLE = 1, PEACH = 2, BANANA = 3;
}
interface COMPANY {
	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class ConstantDemo2 {
	public static void main(String[] args) {
		
		int type = FRUIT.APPLE; //�������̽��� ���ؼ� �̸��� ������ �� ����
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
