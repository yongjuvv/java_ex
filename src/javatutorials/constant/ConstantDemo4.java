package javatutorials.constant;

/*class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}*/

//enum을 사용하는 이유
//1. 코드가 단순해진다.
//2. 인스턴스 생성과 상속을 방지한다.
//3. 키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.
enum Fruit1 {
	APPLE("red"), PEACH("pink"), BANANA("yellow");  //생성자에 매개변수값을 줌
	//위의 class와 완전히 같은 의미
	private String color;
	public String getColor() {
		return this.color;
	}
	
	Fruit1(String color) {
		System.out.println("Call Constructor" + this);
		this.color = color; 
		//enum은 클래스이기에 생성자를 가질 수 있음
		//apple, peach, banana는 인스턴스이며, 인스턴스가 생성될 때 생성자를 호출하기에 3번 호출된다. 
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
			//enum은 열거형이기에 맴버 전체를 열거할 수 있는 기능도 제공한다. 
		}
	}
}
//열거형은 연관된 값들을 저장하며 그 값들이 변경되지 않도록 보장한다.
//또한, 열거형 자체가 클래스이기에 내부에 생성자, 필드, 메소드를 가질 수 있어서 단순한 상수가 아니라 더 많은 역할을 할 수 있다.
