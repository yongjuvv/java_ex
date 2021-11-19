package javatutorials.constant;

/*class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}*/

//enum�� ����ϴ� ����
//1. �ڵ尡 �ܼ�������.
//2. �ν��Ͻ� ������ ����� �����Ѵ�.
//3. Ű���� enum�� ����ϱ� ������ ������ �ǵ��� �������� �и��ϰ� ��Ÿ�� �� �ִ�.
enum Fruit1 {
	APPLE("red"), PEACH("pink"), BANANA("yellow");  //�����ڿ� �Ű��������� ��
	//���� class�� ������ ���� �ǹ�
	private String color;
	public String getColor() {
		return this.color;
	}
	
	Fruit1(String color) {
		System.out.println("Call Constructor" + this);
		this.color = color; 
		//enum�� Ŭ�����̱⿡ �����ڸ� ���� �� ����
		//apple, peach, banana�� �ν��Ͻ��̸�, �ν��Ͻ��� ������ �� �����ڸ� ȣ���ϱ⿡ 3�� ȣ��ȴ�. 
	}
}

enum Company1 {
	GOOGLE, APPLE, ORACLE
}
public class ConstantDemo4 {
	public static void main(String[] args) {
		
		Fruit1 type = Fruit1.APPLE;
//		switch(type) {
//		case APPLE :
//			System.out.println(54 + " kcal, color : "+ Fruit1.APPLE.getColor());
//			break;
//		case PEACH:
//            System.out.println(34+" kcal, color : "+ Fruit1.PEACH.getColor());
//            break;
//        case BANANA:
//            System.out.println(93+" kcal, color : "+ Fruit1.BANANA.getColor());
//            break;
//		}
		for(Fruit1 f : Fruit1.values()) {
			System.out.println(f);
			//enum�� �������̱⿡ �ɹ� ��ü�� ������ �� �ִ� ��ɵ� �����Ѵ�. 
		}
	}
}
//�������� ������ ������ �����ϸ� �� ������ ������� �ʵ��� �����Ѵ�.
//����, ������ ��ü�� Ŭ�����̱⿡ ���ο� ������, �ʵ�, �޼ҵ带 ���� �� �־ �ܼ��� ����� �ƴ϶� �� ���� ������ �� �� �ִ�.
